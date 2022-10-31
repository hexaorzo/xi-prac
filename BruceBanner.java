import java.io.*;
public class BruceBanner
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("N = ");
        int N = Integer.parseInt(br.readLine());
        String[] names = new String[N];
        if (2<N && N<9)
        {
            for(int i=0;i<N;i++)
            {
                System.out.print("Team "+(i+1)+": ");
                names[i] = br.readLine();
            }
            System.out.println();
            int max = 0;
            for(int i=0;i<N;i++)
                if(names[i].length()>max)
                    max = names[i].length();
            for(int i=0;i<max;i++)
            {
                for(int j=0;j<N;j++)
                    if(i<names[j].length())
                        System.out.print(names[j].charAt(i)+"\t");
                    else
                        System.out.print(" \t");
                System.out.println();
            }
        }
        else
            System.out.println("Invalid Input");
    }
}
