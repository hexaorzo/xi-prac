import java.util.*;
public class UniqueNumber 
{
    public static void main(String[] args) 
    {
        int f = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("M = ");
        int m = sc.nextInt();
        System.out.print("N = ");
        int n = sc.nextInt();
        if(m<n)
        {
            System.out.println("The Unique-Digit integers are:");
            for (int i = m; i <= n; i++) 
            {
                boolean unique = true;
                int num = i;
                while (num > 0) 
                {
                    int digit = num % 10;
                    int temp = num / 10;
                    while (temp > 0) 
                    {
                        if (digit == temp % 10) 
                        {
                            unique = false;
                            break;
                        }
                        temp /= 10;
                    }
                    if (!unique)
                        break;
                    num /= 10;
                }
                if (unique)
                {
                    if (f == 0)
                        System.out.print(i);
                    else
                        System.out.print(", "+i);
                    f++;
                }
            }
            System.out.println("\nFrequncy of unique-digit integers is: "+f);
        }
        else
            System.out.println("M must be less than N");
    }
}
