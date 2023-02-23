package com.example.com.shellspringdocker.Processes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Component
@Slf4j
public class wiremockAPICall {

    @Value("${wiremock.url}")
    private String wiremockUrl;





    String jsonPostMessage = "{}";


    public  String httpWiremock() throws IOException, URISyntaxException, InterruptedException {
        try {

            String adminUrl = wiremockUrl + "/wiremock";
            log.info("URL Called is: " + adminUrl);
            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI(adminUrl))
                    .GET()
                    .build();
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse <String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
            String response = getResponse.body();
            log.info ("Response is: " + response);
            return response;


        }
        catch (Exception e) {
            log.info ("There has been some issue: " + e);
        }
        return  null;
    }


}
