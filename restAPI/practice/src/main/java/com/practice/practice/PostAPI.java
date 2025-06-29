package com.practice.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


// http://localhost:8080/api/v1/post_test
@RestController
public class PostAPI {
    @Autowired
    private ApiRepository repository;

    @PostMapping("/api/v1/post_test")
    public ResponseEntity<String> postTest(@RequestBody PostDTO postdto) {
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
            return ResponseEntity.ok("status:" + 200 +"\n" + "saved in Table: apitest");
        } catch (Exception e) {
            return ResponseEntity
                   .status(HttpStatus.BAD_REQUEST)
                   .body("Failed to save: " + e.getMessage());
        }
    }
}