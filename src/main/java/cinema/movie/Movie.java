package cinema.movie;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import cinema.common.Money;
import cinema.discountCondition.DiscountCondition;
import cinema.screenging.Screening;

public abstract class Movie {
	private String title;
	private Duration runningTime;
	private Money fee;
	private List<DiscountCondition> discountConditions;

	public Movie(String title, Duration runningTime, Money fee) {
		this.title = title;
		this.runningTime = runningTime;
		this.fee = fee;
	}

	public Movie(String title, Duration runningTime, Money fee,
		DiscountCondition... discountConditions) {
		this(title, runningTime, fee);
		this.discountConditions = Arrays.asList(discountConditions);
	}

	public Money calculateMovieFee(Screening screening) {
		if (isDiscountable(screening)) {
			return fee.minus(calculateDiscountAmount());
		}

		return fee;
	}

	protected Money getFee() {
		return fee;
	}

	private boolean isDiscountable(Screening screening) {
		return discountConditions.stream()
			.anyMatch(condition -> condition.isSatisfiedBy(screening));
	}

	abstract protected Money calculateDiscountAmount();
}
