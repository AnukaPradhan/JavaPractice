import java.util.Scanner;
class TwoDRArray 
{
	public static void main(String[] args) 
	{
		int a[][][]=new int[2][3][3];
		Scanner scan=new Scanner(System.in);
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
				for (int k=0;k<=a[i][j].length-1;k++)
				{
					System.out.println("Enter the marks of school" +i+ "class" +j+ "Student" +k);
					a[i][j][k]=scan.nextInt();

				}
			}
		}
		
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
				for (int k=0;k<=a[i][j].length-1;k++)
				{
					System.out.println("The marks of School" +i+ "Class" +j+ "Student" +k);
					System.out.println(a[i][j][k]);
				}
			}

		}
	}
}
