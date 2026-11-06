//codeforeces sheet 1 (problem:-Q)
import java.util.*;
public class coordinate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a == 0.0 && b == 0.0){
            System.out.println("origem");
        }
        else if(a == +0.0){
            System.out.println("Eixo Y");
        }
        else if(b == +0.0){
            System.out.println("Exio X");
        }
        else if(a>0.0 && b>0.0){
            System.out.println("Q1");
        }
        else if(a<0.0 && b>0.0){
            System.out.println("Q2");
        }
        else if(a<0.0 && b<0.0){

        }
     else{
        System.out.println("Q4");
        }
    }
}
