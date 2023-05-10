package datad1;

public class MinimumGap {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 3, 4, 1, 7 };
		System.out.println(findGap(arr));
	}

	public static int findGap(int[] arr) {
		int gap = arr.length;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					int minGap = j - i;
					if (minGap < gap) {
						gap = minGap;
					}
				}
			}
		}
		return gap;
	}

}
