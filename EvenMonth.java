import java.util.Scanner;

public class EvenMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int monthDay = 31;
        int evenDaysCount = 0;

        System.out.println("counting even days in the month of August");

        for (int day = 1; day <= monthDay; day++)

            if (day % 2 == 0) {
                evenDaysCount++;
                System.out.println("kunal can go out on day" + day);
            }
    }
}