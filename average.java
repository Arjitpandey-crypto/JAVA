//average of three number
import java.util.*;
public class average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        int a = sc.nextInt();
        System.out.print("enter second number:");
        int b = sc.nextInt();
        System.out.print("enter third number:");
        int  c = sc.nextInt();
        int sum = (a+b+c);
        int average = (sum/3);
        System.out.println("average:"+ average);

    }
}
