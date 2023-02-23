package com.example.com.shellspringdocker.Controller;

import com.example.com.shellspringdocker.Processes.wiremockAPICall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
public class wiremockResponse {

    @Autowired
    wiremockAPICall wac;


    public String wiremockAPIResponse() throws IOException, URISyntaxException, InterruptedException {
        return wac.httpWiremock();
    }

    //This is a test
        @RequestMapping("/something")
        public String home() throws IOException, URISyntaxException, InterruptedException {
            return wiremockAPIResponse();
        }
}
