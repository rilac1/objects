package cinema.reservation;

import cinema.common.Money;
import cinema.customer.Customer;
import cinema.screenging.Screening;

public class ReservationAgency {
	public Reservation reserve(
		Screening screening,
		Customer customer,
		int audienceCount
	) {
		Money fee = screening.calculateFee(audienceCount);
		return new Reservation(customer, screening, fee, audienceCount);
	}
}
