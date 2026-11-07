//codeforeces sheet 1 (problem:-V)


import java.util.*;
public class comparison {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        int b = sc.nextInt();
        switch(s){
            case"<":
            if (a < b){
                System.out.println("Right");
            }
            else{
                System.out.println("Wrong");
            }
            break;
            case">":
            if(a > b){
                System.out.println("Right");

            }
            else{
                System.out.println("Wrong");
            }
            break;
            case"=":
            if(a == b){
                System.out.println("Right");

            }
            else{
                System.out.println("Wrong");
            }
            break;
        }
    }
}
