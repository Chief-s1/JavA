import java.util.*;
class Ara{

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int cho;
		System.out.println("1.Circle area\n2.Square area\n3.Triangle area\n4.Rectangle area\n");
		cho=sc.nextInt();

		if(cho==1)
		{
			float r;
			System.out.println("Enter the radius");
			r=sc.nextFloat();
			System.out.println("Area="+Area(r));
		}
		if(cho==2)
		{
			int rr;
			System.out.println("Enter the Length of side");
			rr=sc.nextInt();
			System.out.println("Area="+Area(rr));

		}
		if(cho==3){
			float b,p;
			System.out.println("Enter lenth of base\n");
			b=sc.nextFloat();
			System.out.println("Enter lenth of Perpendicular\n");
			p=sc.nextFloat();
			System.out.println("Area="+Area(b,p));	
		}

		if(cho==4)
		{
			int rrr;
			float aaa;
			System.out.println("Enter the Length");
			rrr=sc.nextInt();
			System.out.println("Enter Breadth");
			aaa=sc.nextInt();
			System.out.println("Area="+Area(rrr,aaa))	;

		}
		

	}
	static	int Area(int n)
		{
			return n*n;
		}

		static float Area(float r)
		{
			return (float)(22.0/7)*r*r;
		}

		static float Area(float b, float p)
		{
			return (float)(1.0/2)*b*p;
		}
	static	float Area(int l, float b)
		{
			return l*b;
		}
}