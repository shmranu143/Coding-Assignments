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
                      for(int i=0;i<n;i++)
                        for(int j=0;j<n;j++)
                                a[i][j]=sc.nextInt();
                      
                      int top=0,down=n-1,left=0,right=n-1;
                      int direction=0;
                      /* 0 for top to down
                         1 for left to right
                         2 for down to top
                         3 for right to left
                        */
                      while(top<=down && left<=right){
                        if(direction==0){
                                for(int i=top;i<=down;i++)
                                        System.out.print(a[i][left]+" ");
                                left++;
                        }
                        else if(direction==1){
                                for(int i=left;i<=right;i++)
                                        System.out.print(a[down][i]+" ");
                                down--;
                        }
                        else if(direction==2){
                                for(int i=down;i>=top;i--)
                                        System.out.print(a[i][right]+" ");
                                right--;
                        }
                        else if(direction==3){
                                for(int i=right;i>=left;i--)
                                        System.out.print(a[top][i]+" ");
                                top++;
                        }
                        direction=(direction+1)%4;
                      }
	}
}