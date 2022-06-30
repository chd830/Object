public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    void enter(Audience audience) {
        if(audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOfiice().getTicket();
            audience.getBag().setTicket(ticket);
        }
        else {
            Ticket ticket = ticketSeller.getTicketOfiice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOfiice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
