package theater.audience;

import theater.bag.Bag;
import theater.ticket.Ticket;

public class Audience {
	private Bag bag;

	public Audience(Bag bag) {
		this.bag = bag;
	}

	public Long buy(Ticket ticket) {
		return bag.hold(ticket);
	}
}
