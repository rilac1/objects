package cinema.movie;

import java.time.Duration;

import cinema.common.Money;
import cinema.discountCondition.DiscountCondition;

public class AmountDiscountMovie extends Movie {
	private Money discountAmount;

	public AmountDiscountMovie(String title, Duration runningTime,
		Money fee, Money discountAmount, DiscountCondition... discountConditions) {
		super(title, runningTime, fee, discountConditions);
		this.discountAmount = discountAmount;
	}

	@Override
	protected Money calculateDiscountAmount() {
		return discountAmount;
	}
}
