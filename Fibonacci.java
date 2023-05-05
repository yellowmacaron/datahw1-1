package datad1;

public class Fibonacci {

	public static void main(String[] args) {
		int num = 6;
		System.out.println("Fibonacci number at " + num + " is " + findFibonacci(num));

	}

//O(n)
	public static int findFibonacci(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}

		int prev = 0;
		int current = 1;
		int sum = 0;
		for (int i = 1; i < num; i++) {
			sum = current + prev;
			prev = current;
			current = sum;

		}

		return sum;
	}
}
