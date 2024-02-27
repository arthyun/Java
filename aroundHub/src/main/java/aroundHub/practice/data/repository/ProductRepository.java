package aroundHub.practice.data.repository;

import aroundHub.practice.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/*
iBatis나 MyBatis 등에서 DAO라고 불리는 DB_Layer 접근자로, JPA에서는 Repository라고 부르며 인터페이스로 생성합니다.
단순히 인터페이스를 생성 후, JpaRepository<Entity 클래스, PK 타입>를 상속하면 기본적인 CRUD 메소드가 자동으로 생성됩니다.
JpaRepository 인터페이스를 상속받는 것만으로도, 많은 JPA 관련 메소드를 사용할 수 있습니다.
→ save(), findById(), existsById(), count(), deleteById(), delete(), deleteAll(), findOne(), findAll(), count(), exists()
*/

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
