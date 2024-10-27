package com.example.com.examplebean.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;



@Configuration
public class RestConfiguration {

    @Bean
    public RestTemplate r1 (){
        return new RestTemplate() ;
    }
}
