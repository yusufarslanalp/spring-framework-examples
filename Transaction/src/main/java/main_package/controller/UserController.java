package main_package.controller;

import main_package.dto.FlightTicketBookRequest;
import main_package.model.Ticket;
import main_package.model.User;
import main_package.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "user" )
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public String saveBook( @RequestBody User user  ) {

        userRepository.save( user );
        return user.toString();
    }




}
