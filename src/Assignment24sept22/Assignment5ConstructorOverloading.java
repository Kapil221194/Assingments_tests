package Assignment24sept22;

class Student
{
	String stud_name;
	int stud_id;
	String class_name;
	
	Student(String sname, int id)
	{
		stud_name=sname;
		stud_id=id;
	}
	Student(String stud_name,int stud_id,String class_name )
	{
		this.stud_name=stud_name;
		this.stud_id=stud_id;
		this.class_name=class_name;
	}
	void Show() 
	{
	System.out.println(stud_name+"\n"+stud_id+"\n"+class_name);
	}
}
public class Assignment5ConstructorOverloading {

	public static void main(String[] args) {

		Student s1= new Student("Rahul",28);
		Student s2= new Student("Riya",14,"12th");
		s1.Show();
		s2.Show();
	}

}
