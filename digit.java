//codeforeces sheet 1 (problem:-Y)

import java.util.*;
public class digit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b  = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        long ans = (a%100) * (b%100);
        ans = ans%100;
        ans = ans*(c%100);
        ans = ans%100;
        ans = ans * (d%100);
        ans = ans%100;
        System.out.printf("%02d",ans);
    }
}
