package com.example.com.examplebean.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class ApiService {
    private final RestTemplate restemplate;

    public ApiService(RestTemplate restemplate) {
        this.restemplate = restemplate;
    }


    public String ApiMethodService( ) {
        String url ="https://randomuser.me/api/";
        return restemplate.getForObject(url,String.class);
    }
}
