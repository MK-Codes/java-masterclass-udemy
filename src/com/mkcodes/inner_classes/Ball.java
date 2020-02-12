package com.mkcodes.inner_classes;

public class Ball { // outer class

	private String ballName;
	private int ballSize;

	public void setUpBall() {
		new OrangeBall().setUpOrangeBall();
	}

	class OrangeBall { // inner class
		public void setUpOrangeBall() {
			ballName = "inner class ball";
			ballSize = 23;
			System.out.println(ballName + ", " + ballSize);
		}
	}
}
