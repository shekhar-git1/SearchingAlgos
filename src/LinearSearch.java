public class LinearSearch {
        static int linearSearch(int [] arr, int target){
            if (arr.length==0){
                return -1;
            }
            for (int index = 0; index < arr.length; index++) {
                int element = target;
                if(element==arr[index]){
                    return index;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] array= {2,4,6,5,7,9};
        int target=2;
        int ans=linearSearch(array,target);
        System.out.println(ans);
    }
}
