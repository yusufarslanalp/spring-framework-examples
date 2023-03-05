package main_package.service;

import main_package.exception.OutOfStockException;
import main_package.model.Product;
import main_package.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public long decrementStock(Long productId){
        Product product = productRepository.findById(productId).get();
        long stock = product.getStock();
        if(stock <= 0)
        {
            throw new OutOfStockException( product.getTitle() + " has no stock" );
        }

        stock -= 1;
        product.setStock( stock );
        productRepository.save( product );
        return stock;
    }

}
