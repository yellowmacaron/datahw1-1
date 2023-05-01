package datad1;

public class RomanNumberr {

	public static void main(String[] args) {
		String str1 = "III";
		int number1 = romanToNum(str1);
		System.out.println("The number is: " + number1);

		String str2 = "MCMXCIV";
		int number2 = romanToNum(str2);
		System.out.println("The number is: " + number2);
	}
//O(n)
	public static int translateNumber(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

	public static int romanToNum(String s) {
		int currentNum = translateNumber(s.charAt(0));
		int sum = 0;
		for (int i = 1; i < s.length(); i++) {
			int nextNum = translateNumber(s.charAt(i));
			if (currentNum < nextNum) {
				sum -= currentNum;
			} else {
				sum += currentNum;
			}
			currentNum = nextNum;
		}
		sum += currentNum;
		return sum;
	}
}
