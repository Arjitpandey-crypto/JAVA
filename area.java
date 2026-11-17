//wap to area of circle user input the radius
import java.util.*;
public class area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        double radius = sc.nextDouble();
        double  area = 3.14 * radius * radius;
        System.out.print("Area of circle:" + area );
    }
    
}
