import java.util.*;
public class leap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("year:");
        int year = sc.nextInt();
        if(year % 4 == 0){
            System.out.println(year + "leap year");
        }
        else{
            System.out.println(year + " " + "not leap year");
        }

    }
}
