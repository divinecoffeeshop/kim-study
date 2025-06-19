


# RestAPI 개념정리
RestApi에 대한 이해(https://ggumidr.com/entry/RESTful-API-%EA%B5%AC%ED%98%84-%EB%B0%A9%EB%B2%95-%EC%86%8C%EA%B0%9C)


RESTful API는 **REST 아키텍처 스타일**을 따르는 웹 API 설계 방식으로, HTTP 표준을 활용해 **자원을 URI로 표현**하고, **HTTP 메서드(GET, POST, PUT, DELETE)**로 해당 자원을 조작합니다.

---

##  RESTful API의 핵심 개념

- **Resource(자원)**: URI로 표현되는 데이터 (예: `/posts/1`)
- **HTTP Method**: 자원에 대한 행위
  - `GET`: 조회
  - `POST`: 생성
  - `PUT`: 수정
  - `DELETE`: 삭제
- **Representation**: 자원의 표현 방식: XML, JSON (주로 JSON)

---

##  주요 특징

- **간결한 구조**: URI와 HTTP 메서드 조합으로 직관적인 API
- **무상태성(Stateless)**: 서버는 요청 간 상태를 저장하지 않음
- **클라이언트-서버 분리**: 프론트와 백엔드의 독립적 개발 가능
- **다양한 포맷 지원**: JSON, XML 등 유연한 데이터 전송
- **캐싱 및 보안 용이**: HTTP 기반 기능 활용 가능
- **문서화 용이**: 자원 중심 설계로 명확한 API 문서 작성 가능

---

##  구현 흐름

1. 클라이언트가 URI와 함께 요청 전송 (`GET /posts/1`)
2. 서버는 해당 자원을 처리 후 응답 반환
3. 응답에는 HTTP 상태 코드 + 데이터 포함 (`200 OK`, JSON 등)
4. 클라이언트는 응답 데이터를 UI에 반영

---

## Get, Post, Put, Delete

Get : 데이터 조회에 성공하면 Body값에 데이터 값을 저장하여 성공 응답 보냄 (캐싱이 가능하여 같은 데이터를 조회할 경우 조회 속도가 빨라진다)
  - 조회할 데이터에 대한 정보는 URL을 통해서 파라메터를 받는다
  
Post: 새로운 리소스를 생성할떄 사용한다.
  - 같은 POST 요청을 반복해서 했을 때 항상 같은 결과물이 나오는 것을 보장하지 않는다.
  - 두 개의 같은 POST 요청을 보내면 같은 정보를 담은 두 개의 다른 resource를 반환할 가능성이 높다.
  - 요청시에 Body 값과 Content-Type 값을 작성.

Put: 리소스를 생성하거나 업데이트하기 위해 서버로 데이터를 보내는 데 사용된다.
  - 동일한 PUT 요청을 여러 번 호출하면 항상 동일한 결과가 생성된다.
  - 요청시에 Body 값과 Content-Type 값을 작성.
  - URL을 통해서 어떠한 데이터를 수정할지 파라메터를 받는다.
  
Delete: 저장된 리소스를 삭제.
  - 요청시에 Body 값과 Content-Type 값이 비워져있다.
  - URL을 통해서 어떠한 데이터를 삭제할지 파라메터를 받는다.
  - 데이터 삭제에 성공한다면 Body 값 없이 성공 응답만 보내게 된다.





---

##  예시

GET /users/1        → 사용자 조회   (select적인 성향)   (200 성공), (400, 404 에러)
POST /users         → 사용자 생성                     (201)
PUT /users/1        → 사용자 정보 수정
DELETE /users/1     → 사용자 삭제





