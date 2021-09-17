package secondDay2;

public class DuplicateArray {

	public static void main(String[] args) {
		int arr[] = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int size = arr.length;
		int count;
		for (int i = 0; i < size - 1; i++) {
			count = 0;
			for (int j = i + 1; j < size; j++) {
				if (arr[j] == arr[i]) {
					count = count + 1;
				}
			}
			if (count > 0) {
				System.out.println("The elements in the array are:" + arr[i]);
			}
		}
	}
}