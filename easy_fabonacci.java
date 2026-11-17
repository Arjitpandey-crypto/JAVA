//codeforeces sheet 2 (problem:-Y)

import java.util.*;
public class easy_fabonacci {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        for(int i = 1; i <= n; i++){
            System.out.print(a);

            if(i < n ){
                System.out.print(" " );
            }
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
