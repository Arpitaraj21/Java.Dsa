public class EvenNoDigit {
    public static void main(String[] args) {
        int[] nums = {23, 456, 1112, 756,22091, 648928};
        System.out.println(EvenDigits(nums));
    }
    static int EvenDigits(int[] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numOfDigits = digits(num);
        if(numOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count=0;
        while(num >0 ){
            count++;
            num = num/10;
        }
        return count;
    }

}