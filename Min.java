public class Min {
    public static void main(String[] args) {
        int[] nums = {12, 76,34,87,23,-8,-3,87,27};

        System.out.println(minNum(nums));
    }
    static int minNum(int[] arr){
        if(arr.length ==0){
            return -1;
        }
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

}