public class NumSearchInRange {
    public static void main(String[] args) {
        int[] nums = {18,12, -7,3,14,28};
        int target = 18;
        int ans = searchRange(nums, 1,4,target);
        System.out.println(ans);
    }
    static int searchRange(int[] arr, int start, int end, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start; i<=end ; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}