import java.util.Scanner;
class April282 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int len=s.length();
		int quote[]=new int[len];
		int k=0,count=0,n=0, m=0;
		String temp="";
		String res[]=new String[len];
		
		
		 
		for (int i=0;i<=len-1;i++)
		{
			if(s.charAt(i)=='"')
			{
				quote[n]=i;
				n++;
				//count++;
			}
		}
			
			
				
		for (int i=0;i<=len-1;i++)
		{
			if(s.charAt(i)!=' ' && s.charAt(i)!='"')
				temp=temp+s.charAt(i);

				else if(s.charAt(i)=='"')
				{
					for (int j=quote[m];j<=quote[m+1];j++)
					{
						temp=temp+s.charAt(j);
					}
				i=quote[m+1]+1;
				res[k]=temp;
				k++;
				temp=" ";
				count++;
				m=m+2;
				}

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
