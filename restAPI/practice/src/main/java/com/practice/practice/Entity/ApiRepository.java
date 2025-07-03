package com.practice.practice.Entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiRepository extends JpaRepository<ApiTestEntity, Integer>{

    List<ApiTestEntity> findByApiKey(String apiKey);

}
