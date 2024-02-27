package aroundHub.practice.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity // 엔티티 클래스임을 스프링에게 알려줌
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product") // 매핑될 디비 테이블명

// 엔티티 클래스는 디비와 맞닿는 핵심 클래스이다.
public class ProductEntity {
    @Id
    String productId;
    String productName;
    Integer productPrice;
    Integer productStock;
}
