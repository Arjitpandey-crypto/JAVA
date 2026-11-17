import java.util.*;
public class square {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a side:");
        float side = sc.nextFloat();
        float area = (side * side);
        System.out.print("area:" + area);
    }
    
}
