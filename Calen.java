import java.io.*;
class Calen
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("DAY:");
        int da=Integer.parseInt(br.readLine());
        System.out.println("YEAR:");
        int y=Integer.parseInt(br.readLine());
        System.out.println("DATE AFTER (N DAYS):");
        int n=Integer.parseInt(br.readLine());
        int d=da;
        if(d<1||d>366)
        {
            System.out.println("DAY NUMBER OUT OF RANGE");
            System.exit(0);
        }
        if(n<1||n>100)
        {
            System.out.println("DATE AFTER (N DAYS) OUT OF RANGE");
            System.exit(0);
        }
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int i=0;
        String mo[] = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        if((y%4==0)&&(y%100!=0)||(y%400==0))
            a[1]=29;
        int x=0;
        for(i=0;i<12;i++)
        {
            if(d<=a[i])
            {
                x=i;
                break;
            }
            else
                d=d-a[i];
        }
        System.out.println("DATE:\n"+d+"TH "+mo[x]+", "+y);
        d=da+n;
        if(a[1]==28&&d>365)
        {
            y=y+1;
            d=d-365;
        }
        else if(a[1]==29&&d>366)
        {
            y=y+1;
            d=d-366;
        }
        for(i=0;i<12;i++)
        {
            if(d<=a[i])
            {
                x=i;
                break;
            }
            else
                d=d-a[i];
        }
        System.out.println("DATE AFTER "+n+" DAYS:\n"+d+"TH "+mo[x]+", "+y);
    }
}