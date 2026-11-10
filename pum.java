//codeforeces sheet 2 (problem:-V)

import java.util.*;
public class pum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for(int i = 1; i <= n; i++ ){
            System.out.println(num + " " + (num + 1) + " " + (num + 2) + " PUM");
            num += 4;
        }
    }
}
