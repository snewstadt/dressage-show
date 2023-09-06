package net.newstadt.model;

public class Test {

	private String testLevel;
	private String testName;
	private Movement movement; // this will need to be some sort of collection, maybe hashMap?
	private CollectiveMark collectiveMarks; // this will need to be some sort of collection, too - same elements for any
											// test created
	private int errorCount;
	private int finalScorePoints;
	private double finalScorePercent;
	private boolean isEliminated = false;

	// constructor
	public Test(String testLevel, String testName, Movement movement, CollectiveMark collectiveMarks) {
		this.testLevel = testLevel;
		this.testName = testName;
		this.movement = movement;
		this.collectiveMarks = collectiveMarks;
	}

	// methods


	public int calculateMaxPoints() {
		// this will need to loop thru all movements and collective marks to get the
		// maxPoints for each and sum them together
		int sum = 0;

		sum += movement.calculateMaxPoints() + collectiveMarks.calculateMaxPoints();

		return sum;
	}

	// getters & setters
	public Movement getMovement() {
		return movement;
	}

	public void setMovement(Movement movement) {
		this.movement = movement;
	}

	public CollectiveMark getCollectiveMarks() {
		return collectiveMarks;
	}

	public void setCollectiveMarks(CollectiveMark collectiveMarks) {
		this.collectiveMarks = collectiveMarks;
	}

	public int getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
		if (errorCount > 2)
			this.isEliminated = true; // rider is eliminated after more than 2 errors
			System.out.println("Rider has been eliminated due to errors!");
	}

	public int getFinalScorePoints() {
		return finalScorePoints;
	}

	public void setFinalScorePoints() {
		// this will need to loop thru all movements and collective marks to get
		// totalPoints and sum them together
		// if rider is eliminated, finalScorePoints will be 0
		if (isEliminated) {
			finalScorePoints = 0;
		} else {
			int sum = 0;

			sum += movement.calculateTotalPoints() + collectiveMarks.calculateTotalPoints();

			this.finalScorePoints = sum;
		}

	}

	public double getFinalScorePercent() {
		return finalScorePercent;
	}

	public void setFinalScorePercent() {
		// finalScorePercent is the total points earned divided by the maximum possible
		// points
		this.finalScorePercent = (double) finalScorePoints / (double) this.calculateMaxPoints();
	}

	public boolean isEliminated() {
		return isEliminated;
	}

	public void setEliminated(boolean isEliminated) {
		this.isEliminated = isEliminated;
	}

	public String getTestLevel() {
		return testLevel;
	}

	public String getTestName() {
		return testName;
	}

	@Override
	public String toString() {
		return "Test [" + (testLevel != null ? "testLevel=" + testLevel + ", " : "")
				+ (testName != null ? "testName=" + testName + ", " : "")
				+ (movement != null ? "movement=" + movement + ", " : "")
				+ (collectiveMarks != null ? "collectiveMarks=" + collectiveMarks + ", " : "") + "errorCount="
				+ errorCount + ", finalScorePoints=" + finalScorePoints + ", finalScorePercent=" + finalScorePercent
				+ ", isEliminated=" + isEliminated + "]";
	}


	

}
