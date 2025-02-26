import java.util.Arrays;

public class twodarr {
    public static void main(String[] args) {
        int[][] arr  = {{12, 18, 24, 14},
                {55, 60, 78, 84},
                {20, 32, 27},
                {88, 71, 27}
        };
        int target = 27;
        int[] ans= search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr ,int target) {
        for(int i = 0; i< arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
