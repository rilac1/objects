package cinema.screenging;

import java.time.LocalDateTime;

import cinema.common.Money;
import cinema.movie.Movie;

public class Screening {
	private Movie movie;
	private int sequence;
	private LocalDateTime whenScreened;

	public Money calculateFee(int audienceCount) {
		return movie.calculateMovieFee(this);
	}

	public int getSequence() {
		return sequence;
	}

	public LocalDateTime getWhenScreened() {
		return whenScreened;
	}
}
