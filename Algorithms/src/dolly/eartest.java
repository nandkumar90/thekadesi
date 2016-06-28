package dolly;

public class eartest 
{
	public static void main(String[] args)
	{
		System.out.println("Array index out of bound exception-Example");
		try
		{
			int i;
			char[]b={'j','a','v','a'};
			for(i=0;i<b.length;i++)
				System.out.println(i+""+b[i]);
			System.out.println(i+""+b[i]); //i=4not available
		}
		catch(ArrayIndexOutOfBoundsException e)
		
		{
	System.out.println("Error in program"+e);

}
}}