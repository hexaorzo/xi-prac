import java.util.*;
public class LuckyNumbers 
{
    public static void main(String[] args) 
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int[] a = new int[(n+1)];
        for (i = 0; i < n; i++)
            a[i] = (i+1);
        for (int k = 2; k <= n; k++) 
        {
            for(i=(k-1);i<n;i+=k) // replacing every kth element with 0
                a[i] = 0;
            i = k-1;
            for(i=(k-1);i<n;i++) // shifting array elements
                if (a[i] == 0)
                {
                    int j = i;
                    while (j < n-1)
                    {
                        a[j] = a[j+1];
                        j++;
                    }
                    a[j] = 0;
                }
        }
        System.out.print("The Lucky numbers less than "+n+" are:  ");
        for (i = 0; i < n; i++) 
            if (a[i] != 0)
                System.out.print(a[i] + "  ");
        System.out.println();   
    }
}
