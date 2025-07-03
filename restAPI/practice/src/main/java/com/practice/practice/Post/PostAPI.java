package com.practice.practice.Post;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.practice.Entity.ApiRepository;
import com.practice.practice.Entity.ApiTestEntity;


// http://localhost:8080/api/v1/post_test
@RestController
public class PostAPI {
    
    private ApiRepository repository;
    public PostAPI(ApiRepository repository){
        this.repository = repository;
    }

    @PostMapping("/api/v1/post_test")
    public ResponseEntity<Map<String, Object>> postTest(@RequestBody PostDTO postdto) {
        try {
            ApiTestEntity entity = new ApiTestEntity();
            entity.setApiKey(postdto.getApiKey());
            entity.setRequestId(postdto.getRequestId());
            entity.setUriPath(postdto.getUriPath());
            entity.setVersion(postdto.getVersion());
            entity.setMethod(postdto.getMethod());
            entity.setMsg(postdto.getMsg());
            entity.setCreatedDt(postdto.getCreatedDt());

            repository.save(entity);
            Map<String, Object> response = new HashMap<>();
            response.put("status: ", 201);
            response.put("response: ", "Saved successfully");
            return ResponseEntity
                   .status(HttpStatus.CREATED)
                   .body(response);
        } catch (Exception e) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("status: ", 400);
            errorResponse.put("response: ", "Failed to save");
            return ResponseEntity
                   .status(HttpStatus.BAD_REQUEST)
                   .body(errorResponse);
        }
    }
}