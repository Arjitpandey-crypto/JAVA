//codeforeces sheet 1 (problem:-N)
import java.util.*;

public class char1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        if(Character.isUpperCase(x)) {
            System.out.println(Character.toLowerCase(x));
        } else if (Character.isLowerCase(x)) {
            System.out.println(Character.toUpperCase(x));

        }
    }
}
