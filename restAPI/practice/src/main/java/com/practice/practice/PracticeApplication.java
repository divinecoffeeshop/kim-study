package com.practice.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
  
	}

}
/*
 1. spring-boot:run → 스프링 부트 서버 시작 (기본 포트 8080)
 2. 브라우저에 http://localhost:8080/practice1 입력 → GET 요청 발생
 3. 스프링 부트가 @GetMapping("/practice1") 메서드 실행 → Response 객체 반환
 4. 반환된 Response 객체가 JSON으로 변환되어 클라이언트에 전달됨
 5. 브라우저에서 응답 내용 확인 가능
 */



