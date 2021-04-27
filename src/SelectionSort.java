
public class SelectionSort {

	public static void main(String[] args) {

		int[] nums = { 8, 4, 9, -2, 1, 4 };

		// Note that bc arrays are objects, the method
		// parameter will be an alias which means the
		// method can change the array
		selectionSort(nums);

		// Display the sorted array
		for (int value : nums) {
			System.out.println(value);
		}

	}

	public static void selectionSort(int[] arr) {
		for (int index = 0; index < arr.length - 1; index++) {
			int minIndex = index;
			for (int i = index + 1; i < arr.length; i++) {
				if (arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}
			int temp = arr[index];
			arr[index] = arr[minIndex];
			arr[minIndex] = temp;
		}

	}

}
