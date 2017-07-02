import java.util.Scanner;

/**
 * Created by Rukshar Alam on 7/1/2017.
 */
public class JulyEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases  = sc.nextInt();
        for(int t = 0;t<testCases;t++)
        {
            int n = sc.nextInt();
            int a[]= new int[n];
            for(int i = 0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }


            for(int i = 1;i<n;i++)
            {
                a[0] ^=a[i];
            }

            System.out.println(a[0]);




        }
    }
}
