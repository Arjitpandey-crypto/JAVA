//codeforeces sheet 2 (problem:-U)

import java.util.*;
public class some_sum {
    public  static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int total = 0;  
    for(int i = 1; i <= n; i++){
        int num = i;
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        if(sum >= a && sum <= b){
            total += i;
        }
    }
    System.out.print(total);
    }
}
