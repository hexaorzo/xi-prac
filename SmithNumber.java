import java.util.Scanner;
public class SmithNumber
{
    public boolean isPrime(int number)
    {
        int k=0;
        for(k=2;k<=(number/2);k++)
        {

            if(number%k==0)
                return false;
        }
        return true;

    }

    public static void main(String args[])
    {   
        SmithNumber ob = new SmithNumber();
        int sumd=0,sump=0,i=0,temp=0,temp1=0,j=0;
        System.out.println("INPUT:");
        Scanner sc=new Scanner(System.in);
        System.out.print("Starting range : ");
        int lowerRange=sc.nextInt();
        System.out.print("Ending range : ");
        int upperRange=sc.nextInt();
        System.out.print("Smith number in range "+lowerRange+" and "+upperRange+" are : ");
        for(i=lowerRange;i<=upperRange;i++)
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
            for(j=2;j<=i/2;j++)
            {
                while(temp%j==0)
                {
                    if(j<4)
                    {
                        sump=sump+j;
                        temp=temp/j;

                    }
                    else
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
            }
            if(sumd==sump)
            {
                System.out.print(i+" ");
            }
        }
    }
}