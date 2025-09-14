import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class HttpRequestConsole {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter URL or IP address (include http:// or https://): ");
        String input = scanner.nextLine().trim();
        
        // Add http:// if no protocol is specified
        if (!input.startsWith("http://") && !input.startsWith("https://")) {
            input = "http://" + input;
        }
        
        try {
            makeHttpRequest(input);
        } catch (Exception e) {
            System.err.println("Error making HTTP request: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    private static void makeHttpRequest(String urlString) throws IOException {
        URL url;
        
        try {
            url = (new URI(urlString)).toURL();
        } catch (URISyntaxException e) {
            throw new IOException("Invalid URL format: " + urlString);
        }
        
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        
        try {
            connection = (HttpURLConnection) url.openConnection();
            
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(10000); // 10 seconds
            connection.setReadTimeout(10000);    // 10 seconds
            
            connection.setRequestProperty("User-Agent", 
                "Mozilla/5.0 (Java HttpRequestConsole/1.0)");
            
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            System.out.println("Response Message: " + connection.getResponseMessage());
            System.out.println("Content Type: " + connection.getContentType());
            System.out.println("Content Length: " + connection.getContentLength());
            System.out.println("\n--- Response Headers ---");
            
            // Print response headers
            connection.getHeaderFields().forEach((key, value) -> {
                System.out.println((key != null ? key : "Status") + ": " + value);
            });
            
            System.out.println("\n--- Response Body ---");
            
            // Read response body
            if (responseCode >= 200 && responseCode < 300) {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            }
            
            String line;
            StringBuilder response = new StringBuilder();
            
            while ((line = reader.readLine()) != null) {
                response.append(line).append("\n");
            }
            
            String responseBody = response.toString();
            if (responseBody.length() > 5000) {
                System.out.println(responseBody.substring(0, 5000));
                System.out.println("\n... [Response truncated - showing first 5000 characters] ...");
                System.out.println("Total response length: " + responseBody.length() + " characters");
            } else {
                System.out.println(responseBody);
            }
            
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing reader: " + e.getMessage());
                }
            }
            
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}