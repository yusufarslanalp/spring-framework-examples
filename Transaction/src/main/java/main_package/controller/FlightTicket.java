package main_package.controller;

import main_package.dto.FlightTicketBookRequest;
import main_package.model.Ticket;
import main_package.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "flight" )
public class FlightTicket {

    @PostMapping("save")
    public String saveBook( @RequestBody FlightTicketBookRequest flightTicketBookRequest  ) {

        Ticket ticket = flightTicketBookRequest.getTicket();
        User user = flightTicketBookRequest.getUser();
        return "Hello Spring Boot...";
    }


}
