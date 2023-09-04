package net.newstadt.model;

// this may need some sort of super type in common with the Movement class, since many of the elements are the same.

public class CollectiveMark {
	private String movement;
	private String directives;
	private int points;
	private int coefficient;
	private int totalPoints;
	private String remarks;

	// constructor
	public CollectiveMark(String movement, String directives, int coefficient) {
		this.movement = movement;
		this.directives = directives;
		this.coefficient = coefficient;
	}

	// methods
	public int calculateMaxPoints() {
		return 10 * coefficient; // max points for any movement is 10, multiplied by the coefficient.
	}

	// getters & setters
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getMovement() {
		return movement;
	}

	public String getDirectives() {
		return directives;
	}

	public int getCoefficient() {
		return coefficient;
	}

	@Override
	public String toString() {
		return "CollectiveMark [" + (movement != null ? "movement=" + movement + ", " : "")
				+ (directives != null ? "directives=" + directives + ", " : "") + "points=" + points + ", coefficient="
				+ coefficient + ", totalPoints=" + totalPoints + (remarks != null ? ", remarks=" + remarks : "")
				+ "]";
	}

	
	
}
