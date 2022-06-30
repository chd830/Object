public class Audience {
    private Bag bag;
    public Audience(Bag bag) {
        this.bag = bag;
    }
    Bag getBag() {
        return bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
