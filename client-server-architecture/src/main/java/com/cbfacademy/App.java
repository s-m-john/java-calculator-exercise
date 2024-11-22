package com.cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class App {
    public static void main(String[] args) {
        String urlString = "https://codingblackfemales.com";
        //System.out.println("Hello World!"); 
    try {
        // Create a URL object
        URL url = new URL(urlString);

        // Create an HttpURLConnection object
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
        // Set the request method to GET
        connection.setRequestMethod("GET");

        // Check if the response code is HTTP OK (200)
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
        
            try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream()))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } else {
            System.out.println("Failed to connect: HTTP response code " + responseCode);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

}