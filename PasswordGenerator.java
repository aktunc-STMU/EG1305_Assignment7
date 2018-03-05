import java.util.*;

public class PasswordGenerator {

	public static void main(String[] args) {

		System.out.println("How many digits would you like to use for a numeric password?");

		Scanner in = new Scanner(System.in);

		int length = in.nextInt();

		System.out.println("Your password is");

		for (int i = 0; i < length; i++) {

			int r = randomGenerator();

			System.out.print(r + " ");

		}

		in.close();

	}

	public static int randomGenerator() {

		Random r = new Random();

		int number = r.nextInt(10);

		return (number);
	}

}
