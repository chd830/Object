import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOfiice {
    long amount;
    private List<Ticket> tickets = new ArrayList<>();
    public TicketOfiice(long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }
    void minusAMount(long amount) {
        this.amount -= amount;
    }
    void plusAmount(long amount) {
        this.amount += amount;
    }

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }
}
