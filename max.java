//codeforeces sheet 2 (problem:-E)

import java.util.*;
public class max {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long max =0;

        for(int i = 0; i<n; i++){
            long num = sc.nextLong();

            if(num>max){
                max = num;
            }
        }
        System.out.println(max);
    }
}
