//codeforeces sheet 2 (problem:-H)

import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean isprime = true;

        if(x<=1){
            isprime =false;
        }
        else{
            for(int i =2; i<=Math.sqrt(x); i++){
                if(x % i == 0){
                    isprime = false;
                    break;
                }
            }
        }
    if(isprime){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }}}

        