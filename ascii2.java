//wap to print any charcter ASCII value 
import java.util.*;
public class ascii2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character:");
         char ch = sc.next().charAt(0);
         int number  =  ch;
         System.out.print("ASCII value:" + number);
    }
}
