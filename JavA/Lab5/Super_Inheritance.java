	import java.util.*;

class Person{

	int id;
	String name,city;
	Person(int idd,String nam, String cit){
		this.name=nam;
		this.id=idd;
		this.city=cit;
	}
		Person(){}
}

class Employee extends Person{
	float sal;

		Employee(){
			
		}

		Employee(int id,String name,String city ,float sa){
			super(id,name,city);
			this.sal=sa;
		}


		void Disp(){
			System.out.println("Name="+name+"\nId="+id+"\nCity="+city+"\nSalary="+sal);
		}

}


class Xyz{

	public static void main(String args[])
	{
		Employee emp=new Employee(69,"Shivam","dun",(float)8000.00); 
	
		emp.Disp();
	}
}