import java.util.Scanner;

/**
 * Created by Rukshar Alam on 7/2/2017.
 */
public class ParityGame {
    static  boolean allEven(int a[],int n)
    {
        for(int i = 0;i<n;i++)
        {
            if(a[i]%2 == 1)
            {
                return  false;
            }
        }
        return  true;
    }

    static  boolean allOdd(int a[],int n)
    {
        for(int i = 0;i<n;i++)
        {
            if(a[i]%2 == 0)
            {
                return  false;
            }
        }
        return  true;
    }


    static  int numberOfOdd(int a[],int n)
    {
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            if(a[i]%2 == 1)
            {
                count++;
            }
        }
        return count;
    }

    static  int numberOfEven(int a[],int n)
    {
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            if(a[i]%2 == 0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        int a[]=new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        if(n==1)
        {
            if(a[0]%2 ==0)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("-1");
            }
        }
        else
        {
            if(allEven(a,n))
            {
                System.out.println("0");
            }
            else  if(allOdd(a,n))
            {
                if(n%2 == 1)
                {
                    System.out.println("1");
                }
                else
                    System.out.println("0");
            }
            else
            {
                int odd = numberOfOdd(a,n);
                int even = numberOfEven(a,n);
                if(odd == even)
                {


                    int half = n/2;
                    if(odd%2 == 1)
                    {
                        System.out.println("1");
                    }
                    else System.out.println("0");


                }
                else
                {
                    if(odd%2 == 1)
                    {
                        System.out.println("1");
                    }
                    else
                    {
                        System.out.println("0");
                    }
                }
            }
        }
    }
}
