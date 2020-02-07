package com.mkcodes.classes_objects_access_control_constructors_getters_setters;

public class Basketball extends Ball {

	private boolean isNBA;
	public int capacity;

	public boolean isNBA() {
		if (isNBA) {
			return true;
		} else {
			return false;
		}
	}

	public void setIsNBA(boolean mIsNBA) {
		isNBA = mIsNBA;
	}

	@Override
	public void bounce() {
		System.out.println("Bounce the basketball...");
	}

	@Override
	public void deflate() {
		System.out.println("*Splat*");
	}

}
