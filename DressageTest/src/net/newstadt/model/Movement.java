package net.newstadt.model;

public class Movement extends ScoredItem {

	private String startsAt;
	private String endsAt;

	// constructor
	public Movement(int movementNumber, String directives, String movement, int coefficient,
			String startsAt, String endsAt) {
		super(movementNumber, directives, movement, coefficient);
		this.startsAt = startsAt;
		this.endsAt = endsAt;
	}

	// methods

	// getters and setters

	public String getStartsAt() {
		return startsAt;
	}

	public String getEndsAt() {
		return endsAt;
	}

	@Override
	public String toString() {
		return "Movement [" + (startsAt != null ? "startsAt=" + startsAt + ", " : "")
				+ (endsAt != null ? "endsAt=" + endsAt : "")
				+  ", " + super.toString() + "]";
	}
	
	

}
