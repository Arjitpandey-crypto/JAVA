//codeforeces sheet 2 (problem:-R)

import java.util.*;
public class squence {
    
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    while(true){
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n <= 0 || m <= 0){
            break;
        }
        int start =  Math.min(n,m);
        int end = Math.max(n,m);
        int sum = 0;
        for(int i = start; i <= end; i++){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("sum =" + sum);

    }
}}