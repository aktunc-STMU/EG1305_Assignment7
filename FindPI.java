import java.util.*;

public class FindPI {

	public static void main(String[] args) {

		System.out.println(
				"This program will iteratively find the digits of PI using the Leibniz formula\nHow many iterations should we use? Please enter an integer");

		Scanner in = new Scanner(System.in);

		int iterations = in.nextInt();

		long start = System.currentTimeMillis();

		double pi = findDigits(iterations);

		long finish = System.currentTimeMillis();

		// finish-start / 1000.0

		System.out.println("PI = " + pi);

		System.out.println(
				"After " + iterations + " iterations.\nThis pocess took " + (finish - start) / 1000.0 + " seconds.");

		in.close();

	}

	public static double findDigits(int n) {

		double pi = 0;

		for (int i = 0; i < n; i++) {

			double numerator = Math.pow(-1, i);

			pi = pi + (numerator / ((2 * i) + 1));

		}

		return (pi * 4);
	}
}
