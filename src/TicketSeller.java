public class TicketSeller {
    private TicketOfiice ticketOfiice;

    public TicketSeller(TicketOfiice ticketOfiice) {
        this.ticketOfiice = ticketOfiice;
    }

    public void setllTo(Audience audience) {
        ticketOfiice.plusAmount(audience.buy(ticketOfiice.getTicket()));
    }
}
