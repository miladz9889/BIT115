import java.util.Scanner;

public class Assignment1 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);

		System.out.println(
				"=============================================================================================================================");

		System.out.println("Please enter your name: ");

		while (userInput.hasNextInt()) {
			System.out.println("ERROR: You aren't a robot. Use the name your parents gave you using only letters :)");
			userInput.nextLine();
		}

		String name = userInput.nextLine();

		/*
		 * double height = 0; boolean isDouble; do {System.out.println("Hello, " + name
		 * + "." + " Please enter the height of a right triangle"); if
		 * (userInput.hasNextDouble()) { height = userInput.nextDouble(); isDouble =
		 * true; } else { System.out.println("That is not a valid number!"); isDouble =
		 * false; userInput.next(); } }while (!(isDouble)); height =
		 * userInput.nextDouble();
		 */

		System.out.println("Hello, " + name + "." + " Please enter the height of a right triangle");

		while (!userInput.hasNextDouble()) {
			System.out.println("ERROR: Please enter a valid number that is between 0 and 1000");
			userInput.nextLine();

		}

		Double triangleHeight = userInput.nextDouble();

		System.out.println("Now enter the base of the same right triangle: ");
		while (!userInput.hasNextDouble()) {
			System.out.println("ERROR: Please enter a number!");
			userInput.nextLine();
		}

		double base = 0;
		if (base <= 0 || base > 1000) {
			System.out.println("ERROR: Number must be between 0 and 1000");

		}

		Double triangleBase = userInput.nextDouble();

		double triangleArea = (triangleHeight * triangleBase) / 2;

		System.out.println("The area of this triangle is : " + triangleArea);

		System.out.println("Now enter the radius of a circle: ");
		if (!userInput.hasNextDouble()) {
			System.out.println("ERROR: Please enter a number!");
			System.exit(1);
			userInput.hasNextLine();

		}
		;

		double circleRadius = userInput.nextDouble();

		double circleArea = Math.PI * circleRadius * circleRadius;
		double circleParimeter = 2 * Math.PI * circleRadius;

		System.out.println("The area of this circle is " + circleArea);
		System.out.println("The parimeter of this circle " + circleParimeter);

		System.out.println("Can the triangle cover the circle?");
		String answer = userInput.next();
		if ((answer.equals("yes") && triangleArea >= circleArea)
				|| (answer.equals("no") && triangleArea < circleArea)) {
			System.out.println("That is correct!");
		} else {
			System.out.println("That is not correct!");
			System.exit(1);
		}

		System.out.println(
				"=============================================================================================================================");
	}
}