package firstAssignment;

import java.util.Scanner;

public class question_4 {
	public static int first(int arr[] , int x) {
		int i = 0 , j = arr.length - 1;
        int result = -1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(arr[mid] == x){
                result = mid;
                j = mid - 1;
            }
            else if(arr[mid] > x){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        return result;
	}
	public static int last(int arr[] , int x) {
		int i = 0 , j = arr.length - 1;
        int result = -1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(arr[mid] == x){
                result = mid;
                i = mid + 1;;
            }
            else if(arr[mid] > x){
                j = mid - 1;
            }
            else{
                i = mid + 1;
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
		System.out.println(last(arr , x) - first(arr , x) + 1);
	}
}
