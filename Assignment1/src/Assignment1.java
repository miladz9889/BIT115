import java.util.Scanner;

public class Assignment1 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);

		System.out.println(
				"=============================================================================================================================");

		//Ask for name and validate that user inputs a string and nothing else. Then store user input into variable name.
		
		System.out.println("Please enter your name: ");

		while (userInput.hasNextInt() || userInput.hasNextDouble()) {
			System.out.println("ERROR: You aren't a robot. Use the name your parents gave you using only letters :)");
			userInput.nextLine();
		}

		String name = userInput.nextLine();

		//Print out name and then ask for user to input a height. Validate that the user inputs a int/double and that the number is between 0 and 1000
		
		
		
		
		System.out.println("Hello, " + name + "." + " Please enter the height of a right triangle");

		boolean test = false; 
		double triangleHeight = 0.0;

		while (triangleHeight <= 0 || triangleHeight > 1000 || test == false );
		{if(userInput.hasNextDouble())
			{triangleHeight = userInput.nextDouble();
		test = true;
		} else if (!userInput.hasNextDouble()) {
			System.out.println("You need to enter a number!");
			userInput.next();
		}
		}
		
		
		
		
		
		
		/*while (triangleHeight <= 0 || triangleHeight > 1000 || !userInput.hasNextDouble()) {
			System.out.println("ERROR: Please enter a valid number that is between 0 and 1000");
			userInput.nextLine();
		} */
		
		

		System.out.println("Now enter the base of the same right triangle: ");
		while (!userInput.hasNextDouble()) {
			System.out.println("ERROR: Please enter a number!");
			userInput.nextLine();
			System.exit(1);
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