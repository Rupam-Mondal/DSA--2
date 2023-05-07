package firstAssignment;

import java.util.Scanner;

public class lastOccurence {
	public static int lastindex(int[] arr , int x) {
		int low = 0;
		int high = arr.length - 1;
		int result = -1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] == x) {
				result = mid;
				low = mid + 1;
			}
			else if(arr[mid] > x) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size = ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter array elements = ");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter target value = ");
		int x = sc.nextInt();
		System.out.println(lastindex(arr , x));
	}
}
