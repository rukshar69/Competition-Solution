package Devskill_June30;

import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/30/2017.
 */
public class SmallestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase =sc.nextInt();
        sc.nextLine();
        for(int t = 0;t<testCase;t++)
        {
            String input = sc.nextLine();
            char maxChar = 'a';
            int n = input.length();
            char[] chArray = input.toCharArray();
            for(int i =0;i<n;i++)
            {
                char temp = chArray[i];
                if(temp>maxChar)
                {
                    maxChar = temp;
                }
            }
            System.out.println(maxChar);
        }
    }
}
