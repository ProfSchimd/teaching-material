public class Main {
    private static void testRC4() {
        // byte[] key = "mysecretkey".getBytes();
        // RC4 rc4 = new RC4(key);

        // byte[] data = "Hello, world!".getBytes();
        // byte[] encrypted = rc4.encrypt(data);
        // byte[] decrypted = rc4.decrypt(encrypted);

        // System.out.println(new String(data)); // Output: Hello, world!
        // System.out.println(new String(encrypted)); // Output: \u0088K‹Ó#¬äî\u0010Wê
        // System.out.println(new String(decrypted)); // Output: Hello, world!

        String plaintext = "This is a test.";
        byte[] key = "mysecretkey".getBytes();
        RC4 rc4 = new RC4(key);
        byte[] ciphertext = rc4.encrypt(plaintext.getBytes());
        byte[] decrypted = rc4.decrypt(ciphertext);
        System.out.println(new String(decrypted));

    }

    public static void main(String[] args) {
        testRC4();
    }

}
