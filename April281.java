import java.util.Scanner;
class April281 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int len=s.length();
		String temp="";
		String res[]=new String[len];
		int k=0, count=0;
		for (int i=0;i<=len-1;i++)
		{
			if(s.charAt(i)!=' ')
				temp=temp+s.charAt(i);
			else
			{
				res[k]=temp;
				k++;
				temp=" ";
				count++;
			}
		        

		}
		res[k]=temp;
				k++;
				temp=" ";
				count++;
		for (int i=0;i<=count-1;i++)
		{
			System.out.println(res[i]);
		}
	}
}
