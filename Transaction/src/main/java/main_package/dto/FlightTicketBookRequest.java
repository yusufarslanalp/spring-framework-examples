package main_package.dto;

import main_package.model.Ticket;
import main_package.model.User;

public class FlightTicketBookRequest {

    private User user;
    private Ticket ticket;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
