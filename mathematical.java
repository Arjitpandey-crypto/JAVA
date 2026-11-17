//codeforeces sheet 1 (problem:-W)

import java.util.*;
public class mathematical {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       String S = sc.next();
       int B = sc.nextInt();
       String Q = sc.next();
       int c = sc.nextInt();


       int result  = 0;

       if (S.equals("+")){
        result = A + B;      
     }
     else if (S.equals("-")){
        result = A - B;
     }
     else if(S.equals("*")){
        result = A * B;
     }
     if (result == c){
        System.out.println("Yes");
    }
    else{
        System.out.println(result);
    }
    }
}
