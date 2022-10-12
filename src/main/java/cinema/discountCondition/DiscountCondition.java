package cinema.discountCondition;

import cinema.screenging.Screening;

public interface DiscountCondition {
	boolean isSatisfiedBy(Screening screening);
}
