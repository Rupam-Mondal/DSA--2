package secondAssignment;

public class insertionSort {
	public static void main(String args[]) {
		int[] arr = {2 , 3 , 1, 0 , 8 , 7};
		for(int i = 0 ; i < arr.length ; i++) {
			int j = i;
			while(j > 0 && arr[j - 1] < arr[j]) {
				int t = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = t;
				j--;
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}
