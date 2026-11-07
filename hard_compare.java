//codeforeces sheet 1 (problem:-Z)

import java.util.*;
public class hard_compare {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        int c = sc.nextInt();
        int d = sc.nextInt();

        double x = (b * Math.log(a));
        double y = (d * Math.log(c));

        if(x > y){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
