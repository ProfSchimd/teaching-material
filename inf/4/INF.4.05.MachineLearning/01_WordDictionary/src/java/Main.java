import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {
    private static String preprocess(String text) {
        text = text
                .replaceAll("[^A-zÀ-ú]+", " ")
                .toLowerCase();
        return text;
    }
    public static String getText(String textUrl) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create(textUrl))
              .build();
        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            return response.body(); 
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
        
        // Below the async code
        // client.sendAsync(request, BodyHandlers.ofString())
        //       .thenApply(HttpResponse::body)
        //       .thenAccept(Main::preprocess)
        //       .join(); 
    }
    public static void main(String[] args) {
        String textUrl = "https://dmf.unicatt.it/~della/pythoncourse18/commedia.txt";
        String text = getText(textUrl);
        if (text == null) {
            System.out.println("Error, null text!");
            return;
        }
        text = preprocess(text);
        System.out.println(text.substring(50, 300));
    }
}