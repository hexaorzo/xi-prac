import java.util.*;
public class MatrixInfo 
{
	public static void main(String args[])
	{
		int m, n, i, j, max, min, maxr=0, maxc=0, minr=0, minc=0, k = 0;;
		Scanner sc = new Scanner(System.in);
		System.out.print("M = ");
		m = sc.nextInt();
		System.out.print("N = ");
		n = sc.nextInt();
		int a[][] = new int[m][n];
		if (m>2 && m<20 && n>2 && n<20)
        {
			System.out.println("Enter all the values of matrix ");
			for (i = 0; i < m; i++) 
            {
				for (j = 0; j < n; j++) 
                {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("ORIGINAL MATRIX:");
			for (i = 0; i < m; i++) 
            {
				for (j = 0; j < n; j++) 
                {
					System.out.print(a[i][j] + "\t");
				}
				System.out.println("");
			}
            min = a[0][0];
            max = a[0][0];
            for (i = 0; i < m; i++)
            {
                for (j = 0; j < n; j++)
                {
                    if(a[i][j]>max)
                    {
                        max = a[i][j];
                        maxr = i;
                        maxc = j;
                    }
                    if(a[i][j]<min)
                    {
                        min = a[i][j];
                        minr = i;
                        minc = j;
                    }
                }
            }
            System.out.println("LARGEST NUMBER : "+max);
            System.out.println("\tROW = "+maxr);
            System.out.println("\tCOLUMN = "+maxc);
            System.out.println("SMALLEST NUMBER : "+min);
            System.out.println("\tROW = "+minr);
            System.out.println("\tCOLUMN = "+minc);
            int temp[] = new int[m*n];
            for (i = 0; i < m; i++)
            {
                for (j = 0; j < n; j++)
                {
                    temp[k++] = a[i][j];
                }
            }
            for(i=0; i<(m*n-1);i++)
            {
                int s = temp[i]; int p=i;
                for(j=i+1; j<temp.length;j++)
                {
                    if(temp[j]<s)
                    {
                        s = temp[j];
                        p=j;
                    }
                }  
                int t = temp[i];
                temp[i]=temp[p];
                temp[p]=t;     
            }
            k = 0;
            for (i = 0; i < m; i++)
            {
                for (j = 0; j < n; j++)
                {
                    a[i][j] = temp[k++];
                }
            }
            System.out.println("REARRANGED MATRIX:");
			for (i = 0; i < m; i++) 
            {
				for (j = 0; j < n; j++) 
                {
					System.out.print(a[i][j] + "\t");
				}
				System.out.println("");
			}
        }
		else 
        {
			System.out.println("SIZE OUT OF RANGE");
		}
	}
}
