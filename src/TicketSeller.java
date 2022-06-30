public class TicketSeller {
    private TicketOfiice ticketOfiice;

    public TicketSeller(TicketOfiice ticketOfiice) {
        this.ticketOfiice = ticketOfiice;
    }

    public void sellTo(Audience audience) {
        ticketOfiice.sellTicketTo(audience);
    }
}
