import java.util.*;
public class TruthTable 
{
    public static void main(String[] args) 
    {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.println();
        int[] a = new int[n];
        for (i = 0; i < n; i++)
            a[i] = 0;
        for (i = 0; i < n; i++)
        {
            if(i==(n-1))
                System.out.println((char)(65+i));
            else
            {
                if(i==0)
                    System.out.print("\t");
                System.out.print((char)(65+i) + "\t|\t");
            }
        }
        for (i = 0; i < (int)Math.pow(2, n); i++)
        {
            for (j = 0; j < n; j++)
                if(j==(n-1))
                    System.out.print(a[j]);
                else
                {
                    if(j==0)
                        System.out.print("\t");
                    System.out.print(a[j] + "\t|\t");
                }
            System.out.println();
            for (j = n-1; j >= 0; j--)
                if (a[j] == 1)
                    a[j] = 0;
                else 
                {
                    a[j] = 1;
                    break;
                }
        }
    }
}
