import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/24/2017.
 */
public class MaximumUniqueSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();
        for(int t = 0;t<testcases;t++)
        {
            int n = sc.nextInt();
            int c[] = new int[n]; int w[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                c[i] = sc.nextInt();
            }

            for(int i = 0;i<n;i++)
            {
                w[i] = sc.nextInt();
            }

            boolean valid[][]= new boolean[n][n];
            for(int i = 0;i<n;i++)
            {

                for(int j = i;j<n;j++)
                {
                    if(i == j)
                    {
                        valid[i][j] = true;
                    }
                    else if(valid[i][j-1]==false)
                    {
                        valid[i][j]=false;
                    }
                    else
                    {
                        int temp = c[j]; boolean val = true;
                        for(int k = i;k<j;k++)
                        {
                            if(c[k] == temp)
                            {
                                val = false;
                                break;
                            }
                        }
                        if(val)
                        {
                            valid[i][j]=true;
                        }
                        else
                            valid[i][j]= false;

                    }
                }
            }
            long max  = -1; int indexI = 0; int indexJ= 0;
            for(int i = 0;i<n;i++)
            {

                for(int j = i;j<n;j++)
                {
                    if(valid[i][j])
                    {
                        long sum=0;
                        for(int k = i;k<=j;k++)
                        {
                            sum+=w[k];
                        }
                        if(sum>max) {
                            max = sum;
                            indexI = i; indexJ = j;
                        }
                    }
                }
            }

            System.out.println(max);


        }
    }
}
