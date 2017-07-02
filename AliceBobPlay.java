import java.util.Scanner;

/**
 * Created by Rukshar Alam on 7/1/2017.
 */
public class AliceBobPlay
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases  = sc.nextInt();
        for(int t = 0;t<testCases;t++)
        {
            int n = sc.nextInt(); int m = sc.nextInt();

            if(m%2 ==0)
            {
                System.out.println("Bob");
            }
            else
            {
                System.out.println("Alice");
            }




        }
    }
}
