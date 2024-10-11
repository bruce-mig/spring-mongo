package com.github.bruce_mig.spring_mongo.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public String save(Product product){
        // todo: use  a DTO
        // todo: validate the objects
        return  repository.save(product).getId();
    }

    public Product finById(String id) {
        return  repository.findById(id)
                .orElse(null);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public void delete(String id){
        repository.deleteById(id);
    }
}
