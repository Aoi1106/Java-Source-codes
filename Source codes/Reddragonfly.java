import java.util.*;
public class Reddragonfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int max = Math.max(x1,x2);
        int min = Math.min(x1,x2);
        System.out.println(max-min);
    }
}