import java.util.*;

class Student{
	Student(){	
	}
	
	int u_roll;
	String Name,Depart;
	public void data(int u_roll,String Name,String Depart)
	{
		this.u_roll=u_roll;
		this.Name=Name;
		this.Depart=Depart;
	}
	
	public void show(){
		System.out.println("Name="+Name);
		System.out.println("Depart="+Depart);

		System.out.println("Univ_roll_no="+u_roll);
	}
}

class Acx{


public static void main(String args[])
	{

		System.out.println("ENter NAme");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		

		System.out.println("ENter Department");
		String Depart=sc.nextLine();

		System.out.println("ENter Univ_roll_no");
		int id=sc.nextInt();

		Student stud=new Student();
		stud.data(id,name,Depart);
		stud.show();
	
	}

}