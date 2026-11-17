//print largest of two number 
import java.util.*;
public class largest2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        int a = sc.nextInt();
        System.out.print("enter second number:");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a + " " + "is greater");
        }
        else if(a==b){
            System.out.println("Both are equal");
        }
        else{
            System.out.println(b + " " + "is greater" );
        }

    }
    
}
