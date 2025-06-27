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
