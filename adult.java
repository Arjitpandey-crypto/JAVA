import java.util.*;
public class adult {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("ADULT:Drive,vote");
        }
        else if(age>13 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("not adult");
        }
    }
}
