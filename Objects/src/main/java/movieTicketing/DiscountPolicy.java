package movieTicketing;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(List<DiscountCondition> conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    Movie avatar = new Movie("아바타",
            Duration.ofMinutes(120),
            Money.wons(10000),
            new AmountDiscountPolicy(Money.wons(800),
                    new SequenceCondition(1),
                    new SequenceCondition(10),
                    new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10,0), LocalTime.of(11,59)),
                    new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10,0), LocalTime.of(20,59))));
    Movie titanic = new Movie("타이타닉",
            Duration.ofMinutes(180),
            Money.wons(11000),
            new PercentDiscountPolicy(0.1,
                    new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14,0), LocalTime.of(16, 59)),
                    new SequenceCondition(2),
                    new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10,0), LocalTime.of(13,59))));

    public Money calculateDiscountAmount(Screening screening){
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
