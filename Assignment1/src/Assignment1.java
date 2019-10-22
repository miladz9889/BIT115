import java.util.Scanner;

public class Assignment1 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);

		System.out.println(
				"=============================================================================================================================");

		// Ask for name and validate that user inputs a string and nothing else. Then
		// store user input into variable name.

		System.out.println("Please enter your name: ");

		while (userInput.hasNextDouble()) {
			System.out.println("ERROR: You aren't a robot. Use the name your parents gave you using only letters :)");
			userInput.nextLine();
		}

		String name = userInput.nextLine();

		// Print out name and then ask for user to input a height. Validate that the
		// user inputs a double and that the number is between 0 and 1000

		System.out.println("Hello, " + name);
		System.out.println("Please enter the height of a right triangle");

		Double triangleHeight = 0.0;

		while (triangleHeight < 1 || triangleHeight > 1000) {
			System.out.println("Please enter a number between 0 and 1000");
			while (!userInput.hasNextDouble()) {
				System.out.println("Needs to be a number!");
				userInput.next();

			}
			;

			triangleHeight = userInput.nextDouble();
		}

		System.out.println("Now enter the base of the same right triangle: ");

		Double triangleBase = 0.0;

		while (triangleBase < 1 || triangleBase > 1000) {
			System.out.println("Please enter a number between 0 and 1000");
			while (!userInput.hasNextDouble()) {
				System.out.println("Needs to be a number!");
				userInput.next();

			}
			;

			triangleBase = userInput.nextDouble();
		}

		Double triangleArea = (triangleHeight * triangleBase) / 2;

		System.out.println("The area of this triangle is : " + triangleArea);

		System.out.println("Now enter the radius of a circle: ");

		Double circleRadius = 0.0;

		while (circleRadius < 1 || circleRadius > 1000) {
			System.out.println("Please enter a number between 0 and 1000");
			while (!userInput.hasNextDouble()) {
				System.out.println("Needs to be a number!");
				userInput.next();

			}
			

			circleRadius = userInput.nextDouble();
		}

		

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
			
		}

		System.out.println("=============================================================================================================================");
	}

}