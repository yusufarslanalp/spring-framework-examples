package main_package.controller;

import main_package.model.Buyer;
import main_package.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "buyer" )
public class BuyerController {

    @Autowired
    BuyerRepository buyerRepository;

    @PostMapping
    public String saveUser( @RequestBody Buyer buyer) {

        buyerRepository.save(buyer);
        return buyer.toString();
    }




}
