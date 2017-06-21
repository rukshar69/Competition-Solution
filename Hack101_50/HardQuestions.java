package Hack101_50;

import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/20/2017.
 */
public class HardQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String vincent = sc.nextLine();

        String catherine = sc.nextLine();
        //System.out.println(vincent+" "+catherine);

        int maxCorrect = 0;
        for(int i =0;i<n;i++)
        {
            if(vincent.charAt(i) == catherine.charAt(i))
            {
                continue;
            }
            else if(vincent.charAt(i) =='.')
            {
                continue;
            }
            else
            {
                maxCorrect++;
            }
        }
        System.out.println(maxCorrect);
    }
}
