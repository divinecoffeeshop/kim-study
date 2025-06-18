


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

##  예시

GET /users/1        → 사용자 조회
POST /users         → 사용자 생성
PUT /users/1        → 사용자 정보 수정
DELETE /users/1     → 사용자 삭제



