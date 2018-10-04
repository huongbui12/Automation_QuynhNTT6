package core;

public class Calculator {
	private float sum;
	private float diff;

	public Calculator() {
		super();
	}

	public Calculator(float sum, float diff) {
		super();
		this.sum = sum;
		this.diff = diff;
	}

	// 2 overload methods
	public float sum() {
		return this.sum + this.diff;
	}

	public float Sum(float a, float b) {
		return a + b;
	}
	
	// getters, setters
	public float getSum() {
		return sum;
	}

	public void setSum(float sum) {
		this.sum = sum;
	}

	public float getDiff() {
		return diff;
	}

	public void setDiff(float diff) {
		this.diff = diff;
	}
}
