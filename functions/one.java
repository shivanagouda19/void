package functions;
import java.util.*;

public class one {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int bintodec(int n){
        int pow = 0;
        int dec = 0;
        while(n>0){
            int lastDigit = n%10;
            dec = dec + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            n= n/10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = add(a,b);
        System.out.println(sum);
    }
}
