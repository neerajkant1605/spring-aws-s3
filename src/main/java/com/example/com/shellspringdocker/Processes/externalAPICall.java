package com.example.com.shellspringdocker.Processes;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
@Slf4j
public class externalAPICall {

    @Value("${api.url}")
    private String apiUrl;


    public   callAPI() throws IOException, URISyntaxException, InterruptedException {
        try {
            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI(apiUrl))
                    .GET()
                    .build();
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse <String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
            return (getResponse.body());

        }
        catch (Exception e) {
            log.info ("There has been some issue: " + e);
            log.info ("Jenkins test: " + e);
        }
        return  null;
    }
}
