package aroundHub.practice.data.dto;

import aroundHub.practice.data.entity.ProductEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder


public class ProductDTO {
    private String productId;
    private String productName;
    private int productPrice;
    private int productStock;

    // 엔티티 클래스에서 필요한 데이터만 선택적으로 DTO에 담아서 생성해 사용함으로써, 엔티티 클래스를 감추며 보호할 수 있음
    public ProductEntity toEntity() {
        return ProductEntity.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStock(productStock)
                .build();
    }
}
