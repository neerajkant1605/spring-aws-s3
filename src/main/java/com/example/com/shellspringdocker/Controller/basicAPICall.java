package com.example.com.shellspringdocker.Controller;

import com.example.com.shellspringdocker.Processes.externalAPICall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;

@RestController
public class basicAPICall {

    @Autowired
    externalAPICall eac;


    public String apiResponse() throws IOException, URISyntaxException, InterruptedException {
        return eac.callAPI();
    }

    //This is a test
        @RequestMapping("/")
        public String home() throws IOException, URISyntaxException, InterruptedException {
            return apiResponse();
        }
}
