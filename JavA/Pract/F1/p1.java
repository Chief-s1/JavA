import java.util.*;

class A extends Thread{


	public void run(){

		int i=0;

		for(i=0;i<5;i++)
			System.out.println(i+"\n");
	}
}

class B extends Thread{

	public void run(){
		int i;
		for(i=5;i<10;i++)
			System.out.println(i+"\n");
	}

}

class Man
{
	public static void main(String args[]){

		A a=new A();
		B b=new B();

		System.out.println("1st Thread name ="+a.getName()+"\nPriority ="+a.getPriority());
		a.setName("Thread69");
		a.setPriority(3);
		System.out.println("After changing name and priority\nNew Name :"+a.getName()+"\nPriority :"+a.getPriority());
		a.run();

		System.out.println("2nd Thread name ="+b.getName()+"\nPriority ="+b.getPriority());
		b.setName("Thread96");
		b.setPriority(7);
		System.out.println("After changing name and priority\nNew Name :"+b.getName()+"\nPriority :"+.getPriority());
		b.run();
	}
}