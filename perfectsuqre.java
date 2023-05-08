package firstAssignment;

public class perfectsuqre {
    public static int perfect(int x){
        int low = 0;
        int high = x;
        int flag = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int val = mid * mid;
            if(val == x){
                flag = 0;
                return flag;
            }
            else if(val < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int a = 15;
        System.out.println(perfect(a));
    }
}
