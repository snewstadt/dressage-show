package net.newstadt.model;

import java.util.Arrays;

// this may need some sort of super type in common with the Movement class, since many of the elements are the same.

public class CollectiveMark extends ScoredItem{
	
	protected ScoredItem[] collectiveMarks;

	public CollectiveMark(int movementNumber, String directives, String movement, int coefficient) {
		super(movementNumber, directives, movement, coefficient);
	}

	@Override
	public String toString() {
		return "CollectiveMark ["
				+ (collectiveMarks != null ? "collectiveMarks=" + Arrays.toString(collectiveMarks) + ", " : "")
				+ (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}
	
	

	
	
}
