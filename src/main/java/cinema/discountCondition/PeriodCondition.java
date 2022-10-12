package cinema.discountCondition;

import java.time.DayOfWeek;
import java.time.LocalTime;

import cinema.screenging.Screening;

public class PeriodCondition implements DiscountCondition {
	private DayOfWeek dayOfWeek;
	private LocalTime startTime;
	private LocalTime endTime;

	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return screening.getWhenScreened().getDayOfWeek().equals(dayOfWeek) &&
			startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
			endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
	}
}
