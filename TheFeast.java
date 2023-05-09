package datad1;

public class TheFeast {

	public static void main(String[] args) {
		int n = 6;// money
		int c = 2;// price
		int m = 2;// wrap required
		System.out.println("The total of chocolate bars that Bobby can get is: " + theFeast(n, c, m));
	}

	public static int countCandy(int bar, int wrap) {
		if (bar < wrap) {
			return 0;
		}
		int extraBar = bar / wrap;
		return extraBar + countCandy(extraBar + bar % wrap, wrap);

	}

	public static int theFeast(int n, int c, int m) {
		int barPurchased = n / c;

		return barPurchased + countCandy(barPurchased, m);

	}
}
