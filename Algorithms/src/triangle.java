
public class triangle {
	double base;
	double hight;
	Triangle(doubleb,doubleh);
	{
		base='b';
		hight='h';
	}
	double area()
	{
		return(0.5*base*hight);
	}
	}
class tringle1{
public static void main(String[]args)
{
	double area1;
	Tringle t1=new Triangle(10,20);
	Tringle t2=new Triangle(20,30);
	area1=t1.area();
	System.out.println("Area of t1="+area1);
	area1=t2.area();
	System.out.println("Area of t2="+area1);
}
}