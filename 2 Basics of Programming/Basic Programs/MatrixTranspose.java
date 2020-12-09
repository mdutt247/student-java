class MatrixTranspose
{
	public static void main(String args[] )
  	{
    	int m,n,i,j, k;
    	m = Integer.parseInt(args[0]);
    	n = Integer.parseInt(args[1]);

    	System.out.println("Arguments are: " + m + ", " + n + "\n");

    	int a[][]  = new  int[m][n];
    	int b[][]  = new  int[n][m];
    	k = 2;

   		for(i = 0; i<m; i++)
   		{
    		for(j = 0;j<n; j++)
   			{
      			a[i][j] = k;
      			k++;
   			}
		}

		for(i = 0; i<n; i++)
   		{
    		for(j = 0;j<m; j++)
   			{
      			b[i][j] = a[j][i] ;
    		}
		}

		System.out.println("Original Matrix");
		System.out.println();
		for(i = 0; i<m; i++)
   		{
    		for(j = 0;j<n; j++)
   			{
    			System.out.print(a[i][j] + "\t");
   			}
    		System.out.println();
		}
		System.out.println();
		System.out.println("Transposed Matrix");
		System.out.println();
		for(i = 0; i<n; i++)
   		{
    		for(j = 0;j<m; j++)
   			{
    			System.out.print(b[i][j] + "\t");
   			}
    		System.out.println()  ;
		}
	}
}