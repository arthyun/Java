package aroundHub.practice.handler;

import aroundHub.practice.data.dao.ProductDAO;
import aroundHub.practice.data.entity.ProductEntity;

public interface ProductDataHandler {

    ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);

    ProductEntity getProductEntity(String productId);
}
