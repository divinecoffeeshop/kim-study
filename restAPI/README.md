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