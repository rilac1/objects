package cinema.discountCondition;

import cinema.screenging.Screening;

public class SequenceCondition implements DiscountCondition {
	private int sequence;

	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return sequence == screening.getSequence();
	}
}
