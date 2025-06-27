package com.practice.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostAPI {
    @Autowired
    private ApiRepository repository;

   
    // http://localhost:8080/api/v1/post_test
    @PostMapping("/api/v1/post_test")
    public String postTest(@RequestBody PostDTO postdto) {
        
        ApiTestEntity entity = new ApiTestEntity();
        entity.setApiKey(postdto.getApiKey());
        entity.setRequestId(postdto.getRequestId());
        entity.setUriPath(postdto.getUriPath());
        entity.setVersion(postdto.getVersion());
        entity.setMethod(postdto.getMethod());
        entity.setMsg(postdto.getMsg());
        entity.setCreatedDt(postdto.getCreatedDt());
        repository.save(entity);
        return "saved in Table: apitest";
    }
}
