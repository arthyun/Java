package aroundHub.practice.data.dao;

import aroundHub.practice.data.entity.ProductEntity;
import aroundHub.practice.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductDAOImpl implements ProductDAO {
    ProductRepository productRepository;

    @Autowired // 자동으로 연결한다는 의미
    public ProductDAOImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity){
        productRepository.save(productEntity); // 디비 저장
        return productEntity;
    }

    @Override
    public  ProductEntity getProduct(String productId){
        ProductEntity productEntity = productRepository.getById(productId); // ID를 기반으로 데이터를 가져옴
        return productEntity;
    }
}
