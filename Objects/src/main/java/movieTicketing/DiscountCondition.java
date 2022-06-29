package movieTicketing;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
