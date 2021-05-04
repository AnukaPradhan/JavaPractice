class  
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		System.out.println("Enter the value");
		Scanner s = new Scanner(System.in);
		for (int i=0; i<=4; i++)
		{
			a[i]= s.nextInt();
		}
		System.out.printin("The entered vlues are");
		for (int i=0; i<=4; i++ )
		{
			System.out.println(a[i]);

		}
	}
}
