import java.util.*;
class Xyz{

public static void main(String args[])
 {
 System.out.println("Constructor Chaning");
 int a=5;
 Temp t1=new Temp(a,a,a,a);
 }
			}

class Temp
{
    Temp()
    {
        System.out.println("Default constructor");
    }
    Temp(int x)
    {
    		this();
    		--x;
        System.out.println(x+" Parameter constructor");
    }
 
    Temp(int x, int y)
    {		
			this(--x);    
        System.out.println(x+" Parameter constructor");
    }
	
	Temp(int x,int y, int z, int t)
	{
	   this(--x,--y,--z);
 		System.out.println(x+" Parameter constructor");
      }
		Temp(int x, int y, int z)
		{
		   this(--x,--y);
		  System.out.println(x+" Parameter constructor");
		}
}


