package dolly;

public class nesting {
	public static void main(String[]args)
	{
		int a,b;
		for( a=97;a<=100;a++)
		{
			for(b=a;b<=100;b++)
				System.out.print( b+"");
			System.out.println();
		}
	}

}
