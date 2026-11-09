//codeforeces sheet 2 (problem:-Q)

import java.util.*;
public class consecutive_odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int j = 1; j <= t; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int start = Math.min(x,y);
                int end = Math.max(x,y);
                int sum = 0;

                for(int i = start + 1; i < end; i++ ){
                    if(i % 2 != 0){
                        sum += i;
                    }
                }
                System.out.println(sum);

            }
        }
    }

