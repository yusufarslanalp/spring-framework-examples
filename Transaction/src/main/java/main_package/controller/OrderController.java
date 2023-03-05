package main_package.controller;

import main_package.model.Order;
import main_package.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "order" )
public class OrderController {

    @Autowired
    OrderService orderService;



    @PostMapping("make-order")
    public String makeOrder( @RequestBody Order order) {
        return orderService.makeOrder( order );
    }


}
