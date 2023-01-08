public class LSinRange {
    static int Search(int [] arr, int target, int start, int end){
        if (arr.length==0){
            return -1;
        }
        for (int i = start; i <end ; i++) {
            int element = target;
            if(element==arr[i]){
                return i;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        int [] arr={3,5,6,7,8,9,0,-1,3};
        int target =-8;
        System.out.println(Search(arr,target,2,8));
    }
}
