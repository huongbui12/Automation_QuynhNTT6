package core;

import java.util.Scanner;

public class Utils {
	public static float InputFloat(String st) {
		Scanner scanner = new Scanner(System.in);
		float sum;
		while (true) {
			try {
				sum = scanner.nextFloat();
				break;
			} catch (Exception e) {
				System.out.println(st);
				scanner.nextLine();
			}
		}
		scanner.nextLine();
		return sum;
	}
}
