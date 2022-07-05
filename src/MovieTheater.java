import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class MovieTheater {
    public static void main(String[] args) {
        Movie avatar = new Movie("아바타", Duration.ofMinutes(120), Money.wons(10000), new AmountDiscountPolicy(Money.wons(800),
                        new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
                        new SequenceCondition(2)));
        Movie starWars = new Movie("스타워즈", Duration.ofMinutes(210), Money.wons(10000), new NoneDiscountPolicy());
    }
}
