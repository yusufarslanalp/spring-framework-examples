package main_package.service;

import main_package.model.Product;
import main_package.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public long decrementStock(Long productId) throws Exception{
        Product product = productRepository.findById(productId).get();
        long stock = product.getStock();
        if(stock <= 0)
        {
            throw new Exception();
        }


    }

}
