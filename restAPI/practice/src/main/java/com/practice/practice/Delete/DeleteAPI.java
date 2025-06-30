package com.practice.practice.Delete;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practice.practice.Entity.ApiRepository;
import com.practice.practice.Entity.ApiTestEntity;

@RestController
public class DeleteAPI {
    private ApiRepository repository;
    public DeleteAPI(ApiRepository repository){
        this.repository = repository;
    }

    @DeleteMapping("/api/v1/delete_test/{api_key}")
    public ResponseEntity<Map<String, Object>> deleteTest(@PathVariable("api_key") String apiKey){
        List<ApiTestEntity> entities = repository.findByApiKey(apiKey);
        try{
            if (entities.isEmpty()) {
                Map<String, Object> errorResponse = new HashMap<>();
                errorResponse.put("status", 404);
                errorResponse.put("message", "No data found for apiKey: " + apiKey);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
            }
            else{
                Map<String, Object> response = new HashMap<>();
                response.put("status: ", 200);
                response.put("Deleted Succesfully", apiKey);
                repository.deleteAll(entities);
                return ResponseEntity
                        .status(HttpStatus.OK)
                        .body(response);
            }
        } catch (Exception e) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("status: ", 500);
            errorResponse.put("response: ", "Server Error: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }


    }
}
