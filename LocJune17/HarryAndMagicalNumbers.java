package LocJune17;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 7/1/2017.
 */
public class HarryAndMagicalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases  = sc.nextInt();
        for(int t = 0;t<testCases;t++)
        {
            int n = sc.nextInt();
            long s = sc.nextLong();
            int a[] = new int[n];
            int max = -1;
            int min  = 100000;
            for(int i = 0;i<n;i++)
            {
                a[i] = sc.nextInt();
                if(a[i]>max) max= a[i];
                if(a[i]<min) min = a[i];

            }


            Arrays.sort(a);
            long cumulativeSum[] =new long[n+1];
            cumulativeSum[0]=0;
            cumulativeSum[1]=(long) a[0];
            for(int i = 2;i<=n;i++)
            {
                cumulativeSum[i]=cumulativeSum[i-1]+(long)a[i-1];
                //System.out.println("sum "+cumulativeSum[i]);

            }

            int k = 1;
            int kLimit = max-1;
            boolean flag = false;

            for (int i = 1;i<=kLimit;i++)
            {
                long sum = 0;
                if(i<=min)
                {
                    //System.out.println("first");
                    sum = ((long)n)*((long)i);
                    if(sum == s)
                    {
                        //System.out.println("eq");
                        k = i;
                        flag = true;
                        break;
                    }
                }
                else
                {
                    int count = 1;
                    for(int j =1;j<n;j++)
                    {
                        if(i>=a[j])
                        {
                            count++;
                        }
                        else
                            break;
                    }
                    sum = cumulativeSum[count]+ ((long)(n-count))*((long)i);
                    if(sum == s)
                    {
                        k = i;
                        flag = true;
                        break;
                    }
                }

            }
            if(flag)
            {
                System.out.println(k);
            }
            else System.out.println("-1");










        }
    }
}
