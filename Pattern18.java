class Pattern18{
	public static void main(String args[])
	{	
		for(char i='E';i>='A';i--)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(" "+j);
			}
			for(char k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
}
