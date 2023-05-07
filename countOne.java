package firstAssignment;

public class countOne {
	public static int count(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int count = 0;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] == 1) {
				count++;
				if(arr[mid - 1] == 1) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
			else if(arr[mid] == 0) {
				low = mid + 1;
			}
		}
		return count;
	}
	public static void main(String args) {
		int[] arr = {0 ,0 , 0 , 0 , 1 , 1 , 1 , 1 , 1 , 1};
		System.out.println(count(arr));
	}
}
