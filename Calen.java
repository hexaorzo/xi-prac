import java.io.*;
class Calen
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("DAY:");
        int d=Integer.parseInt(br.readLine());
        System.out.println("YEAR:");
        int y=Integer.parseInt(br.readLine());
        System.out.println("DATE AFTER (N DAYS):");
        int n=Integer.parseInt(br.readLine());
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
        d=d+n;
        for(i=x;i<12;i++)
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