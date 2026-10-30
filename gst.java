//enter the cost of 3 items from the user (using float data type).you have to output the total cost of items back to the user as their bill
//+also try adding 18% gst to item in the bill as an advance problem.
import java.util.*;
public class gst {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("enter the value of first item:");
         float a = sc.nextFloat();
         System.out.print("enter the value of second item:");
         float b = sc.nextFloat();
         System.out.print("enter the value of third item:");
         float c = sc.nextFloat();
         float sum = (a + b + c);
         System.out.println("toatl:" + sum);
         float gst = 0.18f;
         float total = sum + gst;
         System.out.println("gst:" + gst);
         System.out.println("Total bill=" + total);
    }
}
