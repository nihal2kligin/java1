import java.util.Scanner;
class Matrix
{
public static void main(String args[])
{
int m,n,i,j;
Scanner in=new Scanner(System.in);
System.out.println("enter the number of rows and columns of matrix");
m=in.nextInt();
n=in.nextInt();
int first[][]=new int[m][n];
int second[][]=new int[m][n];
int sum[][]=new int[m][n];
System.out.println("Enter th first matrix: ");
for(i=0;i<m;i++)
	for(j=0;j<n;j++)
		first[i][j]=in.nextInt();
System.out.println("Enter the second matrix: ");
for(i=0;i<m;i++)
        for(j=0;j<n;j++)
                second[i][j]=in.nextInt();
for(i=0;i<m;i++)
        for(j=0;j<n;j++)
                sum[i][j]=first[i][j]+second[i][j];
System.out.println("The sum of matrix is: ");
for(i=0;i<m;i++)
        for(j=0;j<n;j++)
                System.out.print(sum[i][j]+"\t");
}
}




