package strings;

import java.lang.Math;
class StringManip
{
	public static void main(String args[])
	{
		String str = "PAY PAL IS HIRING ME";
		int len = str.length();
		int rows = 3;
		double cols;
		cols = (double)len/rows;
//System.out.println(cols);
		int columns = (int)Math.ceil(cols);

		str=str.replaceAll(" ","");
	
		System.out.println("Input: "+str);
		System.out.println("Length: "+len);
		System.out.println("Cols: "+columns);
		System.out.println("Rows: "+rows);
		len = str.length();
		char[][] a = new char[rows][columns];
		int pos=0;
		for(int i=0;i<columns;i++)
		{
			for(int j=0;j<rows;j++)
			{
				if(pos<len)
				{
					a[j][i]=str.charAt(pos);
					pos++;
				}
				else
				{
					a[j][i]=' ';
				}
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}