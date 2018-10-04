package test;
import core.Calculator;
import core.Utils;

public class ConsoleFunctions {
	public static void main(String[] args) {
		System.out.println("Enter sum number : ");
		float sum = Utils.InputFloat("Invalid value. Please retype : ");
		System.out.println("Enter diff number : ");
		float diff = Utils.InputFloat("Invalid value. Please retype : ");
		Calculator calculator = new Calculator(sum, diff);
		System.out.println("----------------------------------");
		System.out.println("Sum of numbers get from the attribute fields = " + calculator.sum());
		System.out.println("----------------------------------");
		System.out.println("Sum of numbers get params from outside = " + calculator.Sum(sum, diff));
		System.out.println("----------------------------------");
	}

}
