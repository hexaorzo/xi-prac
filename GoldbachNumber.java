import java.io.*; 
class GoldbachNumber
{ 
    public boolean isPrime(int n)
    {
        for(int k=2;k<=(n/2);k++)
        {
            if(n%k==0)
                return false;
        }
        return true;
    }
    public static void main(String args[]) throws IOException 
    { 
        GoldbachNumber ob = new GoldbachNumber();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("N = ");
        int N=Integer.parseInt(br.readLine());
        if(N>9 && N<50) 
        { 
            if(N%2==0) 
            { 
                System.out.println("PRIME PAIRS ARE:"); 
                for(int i=2;i<=N/2;i++)
                {
                    int j = N-i;
                    if(ob.isPrime(i)&&ob.isPrime(j))  
                        System.out.println(i+", "+j);
                } 
            } 
            else 
                System.out.println("INVALID INPUT. NUMBER IS ODD");
        }
        else 
            System.out.println("INVALID INPUT. NUMBER OUT OF RANGE.");
    } 
} 
