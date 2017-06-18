package Cook83;



import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/18/2017.
 */
public class AdaAndCrayons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();
        for(int t = 0;t<testCase;t++)
        {
           String input = sc.nextLine();
           input = input.replaceAll("U+","a");
           input = input.replaceAll("D+","b");

           int countA = 0; int n = input.length(); int countB = 0;
           for(int i = 0;i<n;i++)
           {
               if(input.charAt(i) == 'a')
               {
                   countA++;
               }
               else countB++;
           }

           if(countA<=countB)
           {
               System.out.println(countA);
           }
           else
           {
               System.out.println(countB);
           }
        }
    }
}
