package main_package.dto;

import main_package.model.Buyer;

public class FlightTicketBookRequest {

    private Buyer buyer;
    private Ticket ticket;

    public Buyer getUser() {
        return buyer;
    }

    public void setUser(Buyer buyer) {
        this.buyer = buyer;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
