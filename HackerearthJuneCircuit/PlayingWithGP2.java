package HackerearthJuneCircuit;

import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/16/2017.
 */
public class PlayingWithGP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int t = 0;t<testCase;t++)
        {
            int r,S,p,n=0; boolean found = false;
            r =sc.nextInt(); S = sc.nextInt(); p = sc.nextInt();
            int[] ai = new int[p];
            ai[0] = 1;

            for(int i = 1;i<p;i++)
            {
                ai[i] = (ai[i-1]*r)%p;

            }

            int[] sum = new int[p+1];
            sum[1] = 1; // if n=1 sum is 1;
            for(int i = 2;i<=p;i++)
            {

                sum[i] = sum[i-1] + ai[i-1];
            }

            for(int i = 2;i<=p;i++)
            {

                sum[i] = sum[i] %p;
            }

            for(int i = 1;i<=p;i++)
            {

                if(sum[i] == S)
                {
                    n = i; found = true; break;
                }
            }

            if(found)
            {
                System.out.println(n);
            }
            else
                System.out.println("-1");
        }
    }
}
