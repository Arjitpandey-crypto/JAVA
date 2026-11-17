import java.util.*;
public class temperature {
    public static void main(String ags[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the temperature:");
        double temp = sc.nextDouble();
        if(temp>100){
            System.out.println("YOU HAVE A FEVER");
        }
        else{
            System.out.println("YOU DONT HAVE A FEVER");
        }

        }
    }
    

