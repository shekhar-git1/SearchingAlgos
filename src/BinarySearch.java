//Binary Search works only in sorted array
public class BinarySearch {

    //return index if the target is found
    //return -1 if the target is not in the array
    static int binarySearch(int [] arr, int target){
        int start=0;
        int end = arr.length-1;
        while(start <= end){
//        int mid = (start + end) / 2 //might be possible that (start+end) will exceed the int range in java
            int mid = start + (end - start) / 2;
            if(target <arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {-4, -2, 0, 2, 4, 5, 25,45, 67,89 };
        int target = 0;
        int ans = binarySearch(array, target);
        System.out.println(ans);
    }

}
