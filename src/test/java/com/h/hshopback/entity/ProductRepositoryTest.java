package com.h.hshopback.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;
    @BeforeEach
    public void beforeEach() {
        System.out.println("beforeEach");
    }
    
    @Test
//    @Rollback(false)
    void insertTest() {
        Product product = Product.builder()
                .testCol("db insert test")
                .build();
        Product savedProduct = productRepository.save(product);
        System.out.println(savedProduct.getTestCol());
    }
    
    

}