import java.util.*;

public class FindSquareRoot {

	public static void main(String[] args) {

		System.out.println("The program will find the square root of a number\nEnter a positive integer");

		Scanner in = new Scanner(System.in);

		long toRoot = in.nextLong();

		sqrt(toRoot);

		in.close();

	}

	public static void sqrt(long n) {

		double lastGuess = 1;

		double nextGuess = 1;

		int count = 0;

		do {
			count++;

			lastGuess = nextGuess;

			nextGuess = (lastGuess + n / lastGuess) / 2;

		} while (Math.abs(lastGuess - nextGuess) > 0.000001);

		System.out.println("The square root of " + n + " is " + nextGuess + "\nThe program found the result in " + count
				+ " iterations");

	}

}
