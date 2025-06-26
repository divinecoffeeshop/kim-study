package com.practice.practice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostAPI {
    // http://localhost:8080/api/v1/post_test
    @PostMapping("/api/v1/post_test")
    public String postTest(@RequestBody postDTO postdto) {
        System.out.println("apiKey: " + postdto.getApiKey());
        return ("apikey: " + postdto.getApiKey()); 
    }
}