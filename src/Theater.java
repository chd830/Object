public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    void enter(Audience audience) {
        ticketSeller.setllTo(audience);
    }
}
