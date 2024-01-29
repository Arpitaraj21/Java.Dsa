import java.util.Arrays;

public class VariableLenArg {
    public static void main(String[] args) {
        fun(2,3,4,5, 56, 87,23);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}