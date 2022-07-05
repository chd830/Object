public class PercentDiscountPolicy extends DiscountPolicy {
    private Double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition ... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovie().getFee().times(percent);
    }
}
