package firstAssignment;

import java.util.Scanner;

public class question_one {
	public static int search(int[] arr , int x) {
		for(int i = 0 ; i < arr.length ;i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
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
		if(search(arr , x) == -1) {
			System.out.println("This number is not present");
		}
		else {
			System.out.println("This number is present , "+search(arr , x));
		}
	}
}
