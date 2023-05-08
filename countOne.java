package firstAssignment;

public class countOne {
	public static int count(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] == 0) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return arr.length - low;
	}
	public static void main(String args) {
		int[] arr = {0 ,0 , 0 , 0 , 1 , 1 , 1 , 1 , 1 , 1};
		System.out.println(count(arr));
	}
}
