package main_package.controller;

import main_package.model.Buyer;
import main_package.model.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "user" )
public class OrderController {
    @PostMapping
    public String makeOrder( @RequestBody Order order) {



        return order.toString();
    }


}
