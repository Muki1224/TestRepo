package com.example.com.examplebean.Controller;


import com.example.com.examplebean.Service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class RestContoller {

    private final ApiService apiService;
    public RestContoller(ApiService apiService) {
        this.apiService=apiService;
    }
    @GetMapping("/Get")
    public String getRandomUser(){
        return apiService.ApiMethodService();
    }
}
