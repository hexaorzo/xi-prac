import java.io.*; 
public class MatrixTriangles
{
	public static void main(String args[]) throws IOException
	{
		int i, j;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows or columns of the square matrix : ");
		int n = Integer.parseInt(br.readLine());
		if (n>3)
        	{
            		int a[][] = new int[n][n];
            		System.out.println("Enter all the elements of matrix ");
			for (i = 0; i < n; i++) 
            		{
				for (j = 0; j < n; j++) 
					a[i][j] = Integer.parseInt(br.readLine());
			}
            		System.out.println("\nMENU");
			System.out.println("1. Border Elements");
			System.out.println("2. Inner Elements");
			System.out.println("3. Lower left triangle including diagonal");
			System.out.println("4. Lower left triangle excluding diagonal");
			System.out.println("5. Upper right triangle including diagonal");
			System.out.println("6. Upper right triangle excluding diagonal");
			System.out.println("7. Lower right triangle including diagonal");
			System.out.println("8. Lower right triangle excluding diagonal");
			System.out.println("9. Upper left triangle including diagonal");
			System.out.println("10. Upper left triangle excluding diagonal");
			System.out.println("11. Exit");
			while (true) 
			{
				System.out.print("\nEnter your choice : ");
				int ch = Integer.parseInt(br.readLine());
				System.out.println();
				switch (ch) 
				{
					case 1:
						System.out.println("Border Elements");
						for (i = 0; i < n; i++) 
						{
							for (j = 0; j < n; j++)
							{
								if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
									System.out.print(a[i][j] + "\t");
								else
									System.out.print(" \t");
							}
							System.out.println();
						}
						break;
					case 2:
						System.out.println("Inner Elements");
						for (i = 0; i < n; i++)
						{
							for (j = 0; j < n; j++)
							{
								if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
									System.out.print(" \t");
								else
									System.out.print(a[i][j] + "\t");
							}
							System.out.println();
						}
						break;
					case 3:
						System.out.println("Lower left triangle including diagonal");
						for (i = 0; i < n; i++)
						{
							for (j = 0; j < n; j++)
							{
								if (i >= j)
									System.out.print(a[i][j] + "\t");
								else
									System.out.print(" \t");
							}
							System.out.println();
						}
						break;
					case 4:
						System.out.println("Lower left triangle excluding diagonal");
						for (i = 0; i < n; i++)
						{
							for (j = 0; j < n; j++)
							{
								if (i > j)
									System.out.print(a[i][j] + "\t");
								else
									System.out.print(" \t");
							}
							System.out.println();
						}
						break;
					case 5:
						System.out.println("Upper right triangle including diagonal");
						for (i = 0; i < n; i++)
						{
							for (j = 0; j < n; j++)
							{
								if (i <= j)
									System.out.print(a[i][j] + "\t");
								else
									System.out.print(" \t");
							}
							System.out.println();
						}
						break;
					case 6:
						System.out.println("Upper right triangle excluding diagonal");
						for (i = 0; i < n; i++)
						{
							for (j = 0; j < n; j++)
							{
								if (i < j)
									System.out.print(a[i][j] + "\t");
								else
									System.out.print(" \t");
							}
							System.out.println();
						}
						break;
					case 7:
						System.out.println("Lower right triangle including diagonal");
						for (i = 0; i < n; i++)
						{
							for (j = 0; j < n; j++)
							{
								if (i + j >= n - 1)
									System.out.print(a[i][j] + "\t");
								else
									System.out.print(" \t");
							}
							System.out.println();
						}
						break;
					case 8:
						System.out.println("Lower right triangle excluding diagonal");
						for (i = 0; i < n; i++)
						{
							for (j = 0; j < n; j++)
							{
								if (i + j > n - 1)
									System.out.print(a[i][j] + "\t");
								else
									System.out.print(" \t");
							}
							System.out.println();
						}
						break;
					case 9:
						System.out.println("Upper left triangle including diagonal");
						for (i = 0; i < n; i++)
						{
							for (j = 0; j < n; j++)
							{
								if (i + j <= n - 1)
									System.out.print(a[i][j] + "\t");
								else
									System.out.print(" \t");
							}
							System.out.println();
						}
						break;
					case 10:
						System.out.println("Upper left triangle excluding diagonal");
						for (i = 0; i < n; i++)
						{
							for (j = 0; j < n; j++)
							{
								if (i + j < n - 1)
									System.out.print(a[i][j] + "\t");
								else
									System.out.print(" \t");
							}
							System.out.println();
						}
						break;
					case 11:
						System.out.println("Exiting...");
						System.exit(0);
					default:
						System.out.println("Invalid choice");
				}
			}
		}
		else
			System.out.println("Size is out of range");
	}
}
