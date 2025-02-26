public class Range {
    public static void main(String[] args) {

        int  [] arr = {29 , -14 , 16 , 56 , 23, 53};
        int target = -14;
        System.out.println(linear(arr, target,1 , 5));

    }
    static int linear(int [] arr , int target , int start , int end){
        if(arr.length == 0){
            return -1;

        }
        for (int i = start; i <= end; i++) {
//            int element = arr[i];
            if(arr[i] == target){
                return i;
            }

        }
        return -1;
    }



}
