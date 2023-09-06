package net.newstadt;

import net.newstadt.model.*;

public class Main {

	public static void main(String[] args) {

		Movement move1 = new Movement(1,
				"Regularity and quality of trot; \nwilling, clear transitions; straightness; \r\n"
						+ "attentiveness; immobility (min. 3 seconds)\r\n",
				"Enter working trot  \n" + "X Halt, salute \n" + "Proceed working trot \n", 2, "A", "X");

		System.out.println(move1);
		System.out.println(move1.calculateMaxPoints());
		move1.scoreItem(7, "Needs more E");
		System.out.println(move1);
		move1.calculateTotalPoints(2);
		System.out.println(move1);
		System.out.println();

		CollectiveMark cm1 = new CollectiveMark(1,"GAITS", "Freedom and regularity", 1);

		System.out.println(cm1);
		System.out.println(cm1.calculateMaxPoints());
		cm1.scoreItem(4, "a comment");
		cm1.calculateTotalPoints(8);
		System.out.println(cm1);

		Test training1 = new Test("Training Level", "Test 1", move1, cm1);

		System.out.println(training1);

		System.out.println(training1.calculateMaxPoints());

		training1.setFinalScorePoints();
		training1.setFinalScorePercent();

		System.out.println();

		System.out.println("Final score was " + training1.getFinalScorePoints() + " out of a possible "
				+ training1.calculateMaxPoints() + " which is " + (training1.getFinalScorePercent() * 100) + "%");

		training1.getMovement().scoreItem(7, "Needs more E");
		training1.getCollectiveMarks().scoreItem(8, "Nice horse!");

		training1.setFinalScorePoints();
		training1.setFinalScorePercent();

		System.out.println();

		System.out.println("Final score was " + training1.getFinalScorePoints() + " out of a possible "
				+ training1.calculateMaxPoints() + " which is " + (training1.getFinalScorePercent() * 100) + "%");
		
		System.out.println();
		
		System.out.println(training1);

		System.out.println();
		
		training1.setErrorCount(3);
		
		training1.setFinalScorePoints();
		training1.setFinalScorePercent();


		System.out.println("Final score was " + training1.getFinalScorePoints() + " out of a possible "
				+ training1.calculateMaxPoints() + " which is " + (training1.getFinalScorePercent() * 100) + "%");
		
	}

}
