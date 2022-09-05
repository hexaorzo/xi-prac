import java.util.*;
public class MatrixDiagonal
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER SIZE : ");
		int n = sc.nextInt();
		if (n<=10)
        	{
            		char a[][] = new char[n][n];
	    		System.out.print("FIRST CHARACTER : ");
            		char ch1 = sc.next().charAt(0);
            		System.out.print("SECOND CHARACTER : ");
            		char ch2 = sc.next().charAt(0);
            		System.out.print("THIRD CHARACTER : ");
            		char ch3 = sc.next().charAt(0);
            		System.out.println();
            		if (ch1!=ch2 && ch2!=ch3 && ch1!=ch3)
            		{
                		int k=0;
                		for (int i=0;i<n;i++)
                		{
                    			for (int j=0;j<n;j++)
                    			{
                        			if (i==j || i+j==n-1)
                        			{
                            				a[i][j] = ch3;
                        			}
                        			else if ((j>i && j<n-i-1) || (j<i && j>n-i-1))
                        			{
                            				a[i][j] = ch1;
                        			}
                        			else
                        			{
                            				a[i][j] = ch2;
                        			}
                    			}
               			}
                		for (int i=0;i<n;i++)
                		{
                    			for (int j=0;j<n;j++)
                    			{
                        			System.out.print(a[i][j]+" ");
                    			}
                    			System.out.println();
                		}
            		}
            		else
            		{
                		System.out.println("CHARACTERS ARE SAME(EQUAL)\nPLEASE ENTER DIFFERENT CHARACTER");
            		}
        	}
		else 
        	{
			System.out.println("SIZE OUT OF RANGE");
		}
	}
}
