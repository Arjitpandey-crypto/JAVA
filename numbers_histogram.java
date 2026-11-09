//codeforeces sheet 2 (problem:-N)



import java.util.*;
public class numbers_histogram {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    char s = sc.next().charAt(0);
    int n = sc.nextInt();
    for (int i = 1; i<=n; i++){
        int x = sc.nextInt();
        for(int j = 1; j <= x; j++){
            System.out.print(s);
        }
        System.out.println();
    }

}    
}
