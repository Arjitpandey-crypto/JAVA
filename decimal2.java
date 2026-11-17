//codeforeces sheet 2 (problem:-X)

import java.util.*;
public class decimal2 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            int count = Integer.bitCount(n);
            int result = (1 << count) - 1;
            System.out.println(result);
        }
    }
}
