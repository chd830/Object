public class Bag {
    private long amount;

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }
    private Invitation invitation;
    private Ticket ticket;
    boolean hasInvitation() {
        return invitation != null;
    }
    boolean hasTicket() {
        return ticket != null;
    }
    void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    void minusAmount(long amount) {
        this.amount -= amount;
    }
    void plusAmount(long amount) {
        this.amount += amount;
    }
}
