# Spring Boot Repository
Spring Boot에서 Repository는 데이터베이스와의 상호작용을 담당하는 계층.  
즉, 데이터를 저장(Create), 조회(Read), 수정(Update), 삭제(Delete)하는 CRUD 작업을 수행하는 역할.

- Repository 인터페이스는 보통 JpaRepository를 상속받아 구현하며, 데이터베이스 관련 기본 메서드를 자동으로 제공받음.
- 별도의 구현 없이도 기본 CRUD 기능을 사용할 수 있어 개발 생산성을 높여줌.
- 필요에 따라 커스텀 쿼리 메서드를 정의하여 복잡한 조회 기능도 쉽게 구현할 수 있다.

## Repository 사용 예시

```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name); 
}
url: https://velog.io/@kevin_/%EB%82%B4%EA%B0%80-repository.save%EB%A5%BC-%ED%86%B5%ED%95%B4%EC%84%9C-%EA%B0%9D%EC%B2%B4%EB%A5%BC-%EC%A0%80%EC%9E%A5%EC%8B%9C%EC%BC%B0%EB%8D%98-%EC%9D%B4%EC%9C%A0