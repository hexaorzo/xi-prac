import java.util.*;
public class ASCIIEncode 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT (encoded text): ");
        String str = sc.nextLine();
        String s = "";
        int n=0;
        for(int i = 0; i < str.length()-1; i+=2)
        {
            if(str.charAt(i) == '1')
            {
                n = Integer.parseInt(str.substring(i, i+3));
                i++;
            }
            else
                n = Integer.parseInt(str.substring(i, i+2));
            if(n == 32 && !s.endsWith(" "))
                s = s + " ";
            else if ((n>=65 && n<=90)||(n>=97 && n<=122))
            {
                if(s.endsWith(" ")||i==1)
                    s = s + Character.toUpperCase((char)n);
                else
                    s = s + Character.toLowerCase((char)n);
            }
            n=0;
        }
        System.out.println("OUTPUT (decoded text): "+s);
    }
}
