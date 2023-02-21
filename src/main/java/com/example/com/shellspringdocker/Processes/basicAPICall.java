package com.example.com.shellspringdocker.Processes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
public class basicAPICall {

    //This is a test

        @RequestMapping("/")
        public String home() {
            return "Basic API Call fdljfdjfldfldjfljl";
        }


}
