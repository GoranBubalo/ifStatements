package ifStatements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// if statement = performs a block of code if it's condition evaluates to be
		// true

		Scanner scanner = new Scanner(System.in);
		System.out.println("Tell me your age: ");
		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("You are an adult!!");
		} else if (age >= 75) {
			System.out.println("Ok Boomer!!!");
		} else if (age >= 13) {
			System.out.println("You are a teenager");
		} else {
			System.out.println("You are not an adult!");
		}

		// PROJECT

		// Compact
		double standardCoupon = 30.50;
		// coupon
		double couponCompact = ((30.50) - (30.50 * 0.07));
		// FullSize
		double standardFullSize = 40.50;
		// coupon
		double couponFullSize = ((40.50) - (40.50 * 0.07));

		// First Question and Answer
		System.out.println("Are you renting a car (Y or N)");
		String response = scanner.next().toUpperCase();

		// First If statement
		if (response.equals("N")) {
			System.out.println("You entered no. Bye");
		} else if (response.equals("Y")) {
			// Second Question and Answer
			System.out.println("Compact or Full-Size? (C or F): ");

			// _______________________________________________________

			// CASE 1
			response = scanner.next().toUpperCase();
			// Second If statement
			if (response.equals("C")) {
				System.out.println("You selected Compact.  ");
				System.out.println("Have coupon (Y or N )");
				response = scanner.next().toUpperCase();
				if (response.equals("N")) {
					System.out.println("Price is " + " " + standardFullSize + " " + "per day");
				} else if (response.equals("Y")) {
					System.out.println("Price is " + " " + couponFullSize + " " + "per day");
				}

				// CASE 2
			} else if (response.equals("F")) {
				System.out.println(" have a coupon ? (Y or N) ");
				response = scanner.next().toUpperCase();
				if (response.equals("N")) {
					System.out.println("Price is " + " " + standardCoupon + " " + "per day");
				} else if (response.equals("Y")) {
					System.out.println("Price is " + " " + couponCompact + " " + "per day");
				}

			}

		}
		
		scanner.close();
	}

}
