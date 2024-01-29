public class SearchInRange {
    public static void main(String[] args) {
        String name = "Arpita";
        char target = 'u';
        boolean ans =searchRange(name,2,4, target);
        System.out.println(ans);

    }
    static boolean searchRange(String str, int start, int end,char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=start; i<=end ;i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}