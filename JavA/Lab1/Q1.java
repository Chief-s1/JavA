class Abc{


 public static void main(String args[])
 {
 Student s1=new Student();
 s1.Disp();
 System.out.println("-----------------------------------------");
 Student s2=new Student("Shivam","69","AI","20011825");
 s2.Disp();
 
 System.out.println("-----------------------------------------");
 Student s3=new Student(args[0]+args[1],args[2],args[3],args[4]);
 s3.Disp();

 
 }
   }


class Student
 {
  String roll_no;
  String name;
  String Branch;
  String roll;

	Student()
	{
	roll_no="58";
	name="Swayam Manori";
	Branch="CSE";
	roll="2018808";
	}
	
	public void Disp()
	{
		System.out.println("Name:"+name);
			System.out.println("Roll_no:"+roll_no);
			System.out.println("Branch:"+Branch);
			System.out.println("Univ_Roll_no:"+roll);

	}
	
	Student(String nm, String rn , String br,String rll )
	{
	roll_no=rn;
	name=nm;
	Branch=br;
	roll=rll;	
      } 
    }
