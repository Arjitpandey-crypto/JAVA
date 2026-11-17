//codeforeces sheet 1 (problem:-R)
import java.util.*;
public class age_in_days {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int years = n / 365;
        int remainingdayAfteryear = n % 365;
        int months = remainingdayAfteryear / 30;
        int days = remainingdayAfteryear % 30;
        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");
    }
}
