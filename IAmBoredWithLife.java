import java.util.Scanner;

/**
 * Created by Rukshar Alam on 7/2/2017.
 */
public class IAmBoredWithLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt();

        int min = a<=b?a:b;

        int product = 1;
        for(int i =2;i<=min;i++)
            product*=i;

        System.out.println(product);
    }
}
