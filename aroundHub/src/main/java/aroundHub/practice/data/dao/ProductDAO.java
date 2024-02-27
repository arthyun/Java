package aroundHub.practice.data.dao;

import aroundHub.practice.data.entity.ProductEntity;

/* interface로 선언 */
public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);

}
