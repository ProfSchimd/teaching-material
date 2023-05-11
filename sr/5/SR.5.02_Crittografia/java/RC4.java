import java.nio.charset.StandardCharsets;

public class RC4 {

    private final byte[] S = new byte[256];
    private final byte[] key;

    public RC4(byte[] key) {
        this.key = key;
       
    }

    private void init() {
        for (int i = 0; i < 256; i++) {
            S[i] = (byte) i;
        }
        int j = 0;
        for (int i = 0; i < 256; i++) {
            j = (j + S[i] + key[i % key.length]) & 0xff;
            byte tmp = S[i];
            S[i] = S[j];
            S[j] = tmp;
        }
    }

    public byte[] encrypt(byte[] data) {
        init();
        byte[] out = new byte[data.length];
        int i = 0, j = 0;
        for (int n = 0; n < data.length; n++) {
            i = (i + 1) & 0xff;
            j = (j + S[i]) & 0xff;
            byte tmp = S[i];
            S[i] = S[j];
            S[j] = tmp;
            byte k = S[(S[i] + S[j]) & 0xff];
            out[n] = (byte) (data[n] ^ k);
        }
        return out;
    }

    public byte[] decrypt(byte[] data) {
        return encrypt(data);
    }

    public static void main(String[] args) {
        byte[] key = "password".getBytes();
        RC4 rc4 = new RC4(key);
        String plaintext = "Hello, world!";
        byte[] ciphertext = rc4.encrypt(plaintext.getBytes());
        byte[] decrypted = rc4.decrypt(ciphertext);
        System.out.println(new String(decrypted,  StandardCharsets.UTF_8));
    }
}
