package LocJune17;

import java.util.Scanner;

/**
 * Created by Rukshar Alam on 7/1/2017.
 */
public class TheRiddler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases  = sc.nextInt();
        for(int t = 0;t<testCases;t++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int m = sc.nextInt();
            int answer;
            int firstRange ;
            int secondRange ;
            if(a<m)
            {
                System.out.println(b/m);
            }
            else if(a%m == 0)
            {
                firstRange = a/m;
                secondRange=b/m;
                System.out.println(secondRange-firstRange+1);
            }
            else if(a>m)
            {
                firstRange = a/m;
                secondRange=b/m;
                System.out.println(secondRange-firstRange);
            }



        }
    }
}
