import java.util.Arrays;

public class MaxIn2dArray {



    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {6, 4, 3, 3, 3, 3},
                {7, 6, 34, 21}
        };

        System.out.println(max(arr));

    }

    static int max(int [][] arr) {
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }

            }

        }
        return max;
    }
}



