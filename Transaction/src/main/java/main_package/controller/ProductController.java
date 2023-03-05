package main_package.controller;

import main_package.model.Buyer;
import main_package.model.Product;
import main_package.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "product" )
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public String saveProduct( @RequestBody Product product) {

        productRepository.save( product );
        return product.toString();
    }

}
