package secondAssignment;

public class selectionSort {
	public static void main(String args[]) {
		int[] arr = {3 , 5 , 1 , 6 , 4};
		for(int i = 0 ; i < arr.length ; i++) {
			int min = i;
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[min] < arr[j]) {
					min = j;
				}
			}
			if(min != i) {
				int t = arr[min];
				arr[min] = arr[i];
				arr[i] = t;
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}
