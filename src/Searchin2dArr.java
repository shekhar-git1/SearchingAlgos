import java.util.Arrays;
import java.util.Scanner;
public class Searchin2dArr {
    public static void main(String[] args) {
    int [][] arr={
            {1,2,3,4},
            {6,4,3,3,3,3},
            {7,6,34,21}
        };
    int target= 3;
    int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int [] search(int [][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row, col};
                }
            }

        }
        return new int[]{-1, -1};
    }
}