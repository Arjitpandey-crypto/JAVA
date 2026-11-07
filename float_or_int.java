//codeforeces sheet 1 (problem:-U)


import java.util.*;
public class float_or_int {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        int integerpart = (int)N;
        double decimalpart = N - integerpart;
        if(decimalpart == 0){
            System.out.println("int " + integerpart);
        }
        else{
            System.out.println("float " + integerpart + " " + decimalpart);
        }
    }
}
