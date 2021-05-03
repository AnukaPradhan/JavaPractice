import java.util.Scanner;
class Apattern1
{
public static void main (String args[])
{ 
System.out.println("Enter the number of rows");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for (int i=1; i<=n; i++)
 {
   for(int j=1; j<=n; j++)
   {
     //if (i==1|| j==1|| j==n|| i==n/2)
        if (j==1||i==1 && j<=n/2|| i==n/2 && j<=n/2||j==n/2)
      {
          System.out.print("*");
       }
     else
      {
          System.out.print(" ");
      }
      }
	System.out.println();
}
}
}
