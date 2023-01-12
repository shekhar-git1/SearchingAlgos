// In order agnostic binary search firstly we have to check that array is sorted in ascending order or descending order
public class OrderAgnosticBS {
    static int orderAgnosticBS(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = (arr[start]<arr[end]);
        int mid = start + (end-start) / 2;
        if(arr[mid]==target){
            return mid;
        }
        if(isAsc){
            if(arr[mid]<target){
                end = mid-1;
            }
            else{
                start = mid=1;
            }
        }
        else {
            if(arr[mid]<target){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {8,7,6,5,4,3,2,1,-1,-2};
        int target = 4;
        int ans = orderAgnosticBS(array, target);
        System.out.println(ans);
    }
}
