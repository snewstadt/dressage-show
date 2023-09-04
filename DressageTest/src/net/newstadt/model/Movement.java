package net.newstadt.model;

public class Movement {
	
	private int movementNumber;
	private String directives;
	private String movement;
	private String startsAt;
	private String endsAt;
	private int points;
	private int coefficient;
	private String remarks;
	private int totalPoints;
	
	
	// constructor
	public Movement(int movementNumber, String directives, String movement, String startsAt, String endsAt,
			int coefficient) {
		this.movementNumber = movementNumber;
		this.directives = directives;
		this.movement = movement;
		this.startsAt = startsAt;
		this.endsAt = endsAt;
		this.coefficient = coefficient;
	}

	
	//methods
	public int calculateMaxPoints() {
		return 10 * coefficient;   // max points for any movement is 10, multiplied by the coefficient.
	}
	
	//getters and setters
	public String getMovement() {
		return movement;
	}


	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public int getTotalPoints() {
		return totalPoints;
	}


	public void setTotalPoints() {
		this.totalPoints = points * coefficient;
	}
	
	public void setTotalPoints(int points) {
		this.points = points;
		setTotalPoints();
	}


	public int getMovementNumber() {
		return movementNumber;
	}


	public String getDirectives() {
		return directives;
	}


	public String getStartsAt() {
		return startsAt;
	}


	public String getEndsAt() {
		return endsAt;
	}


	public int getCoefficient() {
		return coefficient;
	}


	@Override
	public String toString() {
		return "Movement [movementNumber=" + movementNumber + ", "
				+ (startsAt != null ? "startsAt=" + startsAt + ", " : "")
				+ (movement != null ? "movement=" + movement + ", " : "")
				+ (endsAt != null ? "endsAt=" + endsAt + ", " : "") 
				+ (directives != null ? "directives=" + directives + ", " : "")
				+ "points=" + points + ", coefficient="
				+ coefficient + ", " + (remarks != null ? "remarks=" + remarks + ", " : "") + "totalPoints="
				+ totalPoints + "]";
	}
	
	
	

}
