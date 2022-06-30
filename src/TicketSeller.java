public class TicketSeller {
    private TicketOfiice ticketOfiice;

    public TicketSeller(TicketOfiice ticketOfiice) {
        this.ticketOfiice = ticketOfiice;
    }

    public void setllTo(Audience audience) {
        if(audience.getBag().hasInvitation()) {
            Ticket ticket = ticketOfiice.getTicket();
            audience.getBag().setTicket(ticket);
        }
        else {
            Ticket ticket = ticketOfiice.getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketOfiice.plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
