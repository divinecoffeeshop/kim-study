package com.practice.practice.Get;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practice.practice.Entity.ApiRepository;
import com.practice.practice.Entity.ApiTestEntity;

@RestController
public class GetAPI {

    private ApiRepository repository;
    public GetAPI(ApiRepository repository){
        this.repository = repository;
    }

    @GetMapping("/api/v1/get_test/{api_key}")
     public ResponseEntity<?> getContents(@PathVariable("api_key") String apiKey) {
        try {
            
            List<ApiTestEntity> entities = repository.findByApiKey(apiKey);
            if (entities.isEmpty()) {
                Map<String, Object> noApiKey = new HashMap<>();
                noApiKey.put("status: ", 404);
                noApiKey.put("response: ", "No data found for api_key: " + apiKey);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(noApiKey);
            }
            else{
                return ResponseEntity.ok(entities);
            }

        } catch (Exception e) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("status: ", 500);
            errorResponse.put("response: ", "Server Error: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }
        
}
