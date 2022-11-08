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
            if(i==(n-1))
                System.out.println((char)(65+i));
            else
                System.out.print((char)(65+i) + "\t|\t");
        for (i = 0; i < (int)Math.pow(2, n); i++)
        {
            for (j = 0; j < n; j++)
                if(j==(n-1))
                    System.out.println(a[j]);
                else
                    System.out.print(a[j] + "\t|\t");
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