package main_package.service;

import main_package.model.Buyer;
import main_package.model.Order;
import main_package.model.Product;
import main_package.paymentUtil.LimitService;
import main_package.repository.BuyerRepository;
import main_package.repository.OrderRepository;
import main_package.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    BuyerRepository buyerRepository;

    @Autowired
    ProductService productService;

    @Transactional
    public String makeOrder( @RequestBody Order order) {
        productService.decrementStock( order.getProductId() );
        Buyer buyer = buyerRepository.findById(order.getBuyerId()).get();
        Product product = productRepository.findById(order.getProductId()).get();
        LimitService.isLimitSufficient( buyer.getCardId(), product.getPrice() );
        orderRepository.save(order);

        return order.toString();
    }

}
