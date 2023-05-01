package datad1;

public class Prefix {

	public static void main(String[] args) {
		String[] str1 = { "flower", "flight", "fly" };
		System.out.println("the longest same string is: " + findPrefix(str1));

		String[] str2 = { "dog", "racecar", "car" };
		System.out.println("the longest same string is: " + findPrefix(str2));
	}

//O(n*m) with n is the length of input array and m is the longest string in the array
	public static String findPrefix(String[] strings) {
		if (strings.length == 0) {
			return "This is an empty array";
		}
		String prefix = strings[0];
		for (int i = 1; i < strings.length; i++)
			while (strings[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "there is no similar string";
				}
			}
		return prefix;

	}
}