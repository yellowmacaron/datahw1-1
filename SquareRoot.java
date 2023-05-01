package datad1;

public class SquareRoot {

	public static void main(String[] args) {
		int number = 23;
		System.out.println("The square root of number of " + number + " is " + findSquareRoot(number));

	}

//O(n)
	public static double findSquareRoot(int num) {
		if (num < 2 && num > 0) {
			return num;
		}
		double temp;
		double squroot = num / 2;
		do {
			temp = squroot;
			squroot = (temp + (num / temp)) / 2;
		} while ((temp - squroot) != 0);
		return squroot;
	}

}
