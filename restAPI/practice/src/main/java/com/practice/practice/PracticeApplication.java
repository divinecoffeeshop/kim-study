package com.practice.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
        Response a = new Response("this is to test api practice restAPI");
        System.out.println(a.getMessage());
	}

}
/*
 1. spring-boot:run → 스프링 부트 서버 시작 (기본 포트 8080)
 2. 브라우저에 http://localhost:8080/practice1 입력 → GET 요청 발생
 3. 스프링 부트가 @GetMapping("/practice1") 메서드 실행 → Response 객체 반환
 4. 반환된 Response 객체가 JSON으로 변환되어 클라이언트에 전달됨
 5. 브라우저에서 응답 내용 확인 가능
 */
@RestController
class GetController {
    //http://localhost:8080/practice1
    @GetMapping("/practice1")
    public Response practice() {
        return new Response("this is to test api practice restAPI");
    }
}

