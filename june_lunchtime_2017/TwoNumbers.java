import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/24/2017.
 */
public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();
        for(int t = 0;t<testcases;t++)
        {
            int a,b,n;
            a = sc.nextInt(); b=sc.nextInt(); n = sc.nextInt();
            if(n%2 == 1)
            {
                a *= 2;
            }

            if(a>=b)
            {
                System.out.println(a/b);
            }
            else
            {
                System.out.println(b/a);
            }
        }
    }
}
