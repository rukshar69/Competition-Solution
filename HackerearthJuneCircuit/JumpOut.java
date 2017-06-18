package HackerearthJuneCircuit;

import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/16/2017.
 */
//https://www.hackerearth.com/challenge/competitive/june-circuits-17/algorithm/jump-out-34/

public class JumpOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lengthOfJump=0 ; boolean onlyOnce = true;
        for(int i = 1;i<=n;i++)
        {
            int temp = sc.nextInt();
            if(temp+i>n && onlyOnce)
            {
                onlyOnce = false;
                lengthOfJump = i;
            }
        }

        System.out.println(lengthOfJump);
    }
}
