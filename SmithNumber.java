import java.util.Scanner;
public class SmithNumber
{
    public boolean isPrime(int number)
    {
        for(int k=2;k<=(number/2);k++)
        {

            if(number%k==0)
                return false;
        }
        return true;

    }

    public static void main(String args[])
    {   
        SmithNumber ob = new SmithNumber();
        int sumd, sump, temp, temp1, count=0;
        String outstr="";
        System.out.println("INPUT:");
        Scanner sc=new Scanner(System.in);
        System.out.print("Starting range : ");
        int lowerRange=sc.nextInt();
        System.out.print("Ending range : ");
        int upperRange=sc.nextInt();
        System.out.println("OUTPUT:");
        for(int i=Math.min(lowerRange,upperRange);i<=Math.max(lowerRange,upperRange);i++)
        {
            temp=i;
            sumd=0;
            sump=0;
            while(temp>0)
            {
                sumd=sumd+(temp%10);
                temp=temp/10;
            }
            temp=i;
            for(int j=2;j<=i/2;j++)
            {
                while(temp%j==0)
                {
                    if(ob.isPrime(j)==true)
                    {
                        temp1=j;
                        while(temp1>0)
                        {
                            sump=sump+(temp1%10);
                            temp1=temp1/10;
                        }
                        temp=temp/j;
                    }
                }
            }
            if(sumd==sump)
            {
                outstr=outstr+i+", ";
                count++;
            }
        }
        if(count==0)
            System.out.println("No Smith number in given range:");
        else
        {
            outstr=outstr.substring(0,outstr.length()-2);
            System.out.print("Smith number in range "+lowerRange+" and "+upperRange+" are : ");
            System.out.println(outstr);
            System.out.println("Total smith number in range are : "+count);
        }
    }
}
