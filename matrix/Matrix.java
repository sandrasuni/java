import java.util.Scanner;
class Matrix
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of rows:");
int m=sc.nextInt();
System.out.println("Enter the no of columns:");
int n=sc.nextInt();
int [][]m1=new int[m][n];
int [][]m2=new int[m][n];
int [][]m3=new int[m][n];

System.out.println("Enter the 1st matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
m1[i][j]=sc.nextInt();
}
}

System.out.println("Enter the 2nd matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
m2[i][j]=sc.nextInt();
}
}

System.out.println("The resultant matrix is:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
m3[i][j]=m1[i][j]+m2[i][j];
System.out.print(m3[i][j]+"\t");
}
System.out.println();
}
}
}
