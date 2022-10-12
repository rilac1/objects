package theater.bag;

import theater.invitation.Invitation;
import theater.ticket.Ticket;

public class Bag {
	private Long amount;
	private Ticket ticket;
	private Invitation invitation;

	public Bag(Long amount) {
		this(null, amount);
	}

	public Bag(Invitation invitation, Long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}

	public Long hold(Ticket ticket) {
		if (hasInvitation()) {
			setTicket(ticket);
			return 0L;
		} else {
			setTicket(ticket);
			minusAmount(ticket.getFee());
			return ticket.getFee();
		}
	}

	private void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	private boolean hasInvitation() {
		return invitation != null;
	}

	private void minusAmount(Long amount) {
		this.amount -= amount;
	}
}
