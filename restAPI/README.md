# How to test API


## Build and Run

### Build
./gradlew build -x test

### Run
./gradlew bootRun

## Post, Get, Delete

### Post

curl -X POST http://localhost:8080/api/v1/post_test \
  -H "Content-Type: application/json" \
  -d '{
    "api_key": "apikey23",
    "request_id": "f3d4c8b0a97b48c88b92bfb76b6c89321",
    "uri_path": "/api/v1/post_test",
    "version": "v1",
    "method": "POST",
    "msg": "메세지 아무거나 도로로롱"
  }'

### Get

curl -X GET "http://localhost:8080/api/v1/get_test/apikey23"
- api_key:apikey23에 해당되는 데이터 조회

### Delete

curl -X DELETE "http://localhost:8080/api/v1/delete_test/apikey23"
- api_key:apikey23에 해당되는 레코드들 삭제

## Docker
### 이미지 빌드
docker build -t my-spring-test . 

### 컨테이너 실행
docker run -p 8080:8080 my-spring-test

## Extra
resource 폴더안에 application.properties만들고 밑에 내용 집어넣을것
spring.application.name=practice
spring.datasource.url=jdbc:mysql://34.64.244.98:3306/testapi?serverTimezone=UTC&useSSL=false
spring.datasource.username=아이디 알아서
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
