import java.util.*;
public class odd_even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        if (a>b){
      System.out.println(a + " " + "is largest");
        }
        else if (a==b){
            System.out.println("Both are equal");
        }
        else{
            System.out.println(b + " " + "is largest");
        }
    }



    
}
