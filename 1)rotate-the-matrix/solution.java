import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc=new Scanner(System.in);
					  int n=sc.nextInt();
					  int a[][]=new int[n][n];
					  int b[][]=new int[n][n];
					  //int temp=n-1;
					  
					  for(int i=n-1;i>=0;i--){
						  for(int j=0;j<n;j++){
							  a[j][i]=sc.nextInt();
						  }
					  }
					  for(int i=0;i<n;i++){
						  for(int j=0;j<n;j++){
							  System.out.print(a[i][j]+" ");
						  }
						  System.out.println();
					  }
					  System.out.println();
					  int k=n;
					  for(int i=0;i<n;i++){
						  for(int j=0;j<n;j++){
							  b[j][k-1]=a[i][j];
						  }
						  k--;
					  }
					  for(int i=0;i<n;i++){
						  for(int j=0;j<n;j++){
							  System.out.print(b[i][j]+" ");
						  }
						  System.out.println();
					  }
	}
}