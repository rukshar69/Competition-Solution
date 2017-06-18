package HackerearthJuneCircuit;

import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/16/2017.
 */
public class PlayingWithGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int t = 0;t<testCase;t++)
        {
            int r,S,p,n; boolean done = false;
            r =sc.nextInt(); S = sc.nextInt(); p = sc.nextInt();
            for( n = 1;n<p;n++)
            {
                int sum = 0; int ai=0;
                for(int i = 1;i<=n;i++)
                {

                    if(i == 1)
                    {
                        ai = 1;
                        sum += (ai%p);
                    }
                    else
                    {
                        ai = (ai*r)%p;
                        sum += ai;
                    }
                }
                if((sum%p) == S)
                {
                    done = true;
                    break;
                }
            }
            if(done)
            {
                System.out.println(n);
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}
