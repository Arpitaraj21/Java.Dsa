public class LinearSearchBool {
    public static void main(String[] args) {
        int[] nums = {12, 34,54,23,-7,-8,28,-4,18,97};
        int target = 97;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0 ; index < arr.length ;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}