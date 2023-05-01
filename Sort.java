package datad1;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 0, 2, 0, 1, 2, 0, 0, 2, 2, 1 };
		System.out.println(Arrays.toString(arr));
		sortArray1(arr);
		System.out.println(Arrays.toString(arr));

	}
//O(n)
	public static void sortArray1(int[] array) {
		int low = 0;
		int mid = 0;
		int high = array.length - 1;
		while (mid <= high) {
			if (array[mid] == 0) {
				int temp = array[low];
				array[low] = array[mid];
				array[mid] = temp;
				low++;
				mid++;
			} else if (array[mid] == 1) {
				mid++;
			} else {
				int temp = array[mid];
				array[mid] = array[high];
				array[high] = temp;
				high--;
			}
		}
	}

}
