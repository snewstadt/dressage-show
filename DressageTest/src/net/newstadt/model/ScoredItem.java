package net.newstadt.model;

public class ScoredItem {

	private int movementNumber;
	private String movement;
	private String directives;
	protected int points;
	private int coefficient;
	protected String remarks;
	protected int totalPoints;
	
	public ScoredItem(int movementNumber, String directives, String movement, int coefficient) {
		this.movementNumber = movementNumber;
		this.directives = directives;
		this.movement = movement;
		this.coefficient = coefficient;
	}
	
	public int calculateMaxPoints() {
		return 10 * coefficient;   // max points for any movement is 10, multiplied by the coefficient.
	}
	
	public int calculateTotalPoints() {
		this.totalPoints = points * coefficient;
		return totalPoints;
	}
	
	public int calculateTotalPoints(int points) {
		this.points = points;
		return calculateTotalPoints();
	}
	
	public void scoreItem(int points, String remarks) {
		this.remarks = remarks;
		calculateTotalPoints(points);
	}

	@Override
	public String toString() {
		return "ScoredItem [movementNumber=" + movementNumber + ", "
				+ (movement != null ? "movement=" + movement + ", " : "")
				+ (directives != null ? "directives=" + directives + ", " : "") + "points=" + points + ", coefficient="
				+ coefficient + ", " + (remarks != null ? "remarks=" + remarks + ", " : "") + "totalPoints="
				+ totalPoints + "]";
	}
	
	
	

}
