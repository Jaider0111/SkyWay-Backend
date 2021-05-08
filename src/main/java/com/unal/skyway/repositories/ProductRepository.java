package com.unal.skyway.repositories;

import com.unal.skyway.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {

    @Override
    public void delete(Product product); // this is the only method that is not included in CrudRepository class

}
