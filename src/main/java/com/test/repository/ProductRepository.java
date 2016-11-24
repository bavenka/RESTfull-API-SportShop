package com.test.repository;

import com.test.model.entity.product.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Павел on 13.11.2016.
 */
@Service
public interface ProductRepository extends CrudRepository<Product, Long>{
}