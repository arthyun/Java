package aroundHub.practice.service;

import aroundHub.practice.data.dto.ProductDTO;
import aroundHub.practice.data.entity.ProductEntity;
import aroundHub.practice.handler.ProductDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    ProductDataHandler productDataHandler;

    @Autowired
    public ProductServiceImpl(ProductDataHandler productDataHandler) {
        this.productDataHandler = productDataHandler;
    }

    @Override
    public ProductDTO saveProduct(String productId, String productName, int productPrice, int productStock) {
        // 구현코드 작성란
        ProductEntity productEntity = productDataHandler.saveProductEntity(productId, productName, productPrice, productStock);
        ProductDTO productDTO = new ProductDTO(productEntity.getProductId(), productEntity.getProductName(), productEntity.getProductPrice(), productEntity.getProductStock());
        return productDTO;
    }

    @Override
    public ProductDTO getProduct(String productId) {
        // 구현코드 작성란
        ProductEntity productEntity = productDataHandler.getProductEntity(productId);
        ProductDTO productDTO = new ProductDTO(productEntity.getProductId(), productEntity.getProductName(), productEntity.getProductPrice(), productEntity.getProductStock());
        return productDTO;
    }
}
