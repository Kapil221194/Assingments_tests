package assignments03dec22;
import java.util.*;

class Department {
	int deptid;
	String deptname;

	Department(int deptid, String deptname) {
		this.deptid = deptid;
		this.deptname = deptname;
	}

	public int getDeptid() {
		return deptid;
	}

	public String getDeptname() {
		return deptname;
	}

}

class Employee {
	int empno;
	String empname;
	Department dept;

	public Employee(int empno, String empname, Department dept) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.dept = dept;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEmpname() {
		return empname;
	}

	public Department getDept() {
		return dept;
	}

}

public class Assign8 {

	public static void main(String[] args) {

		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee(10, "Rahul", (new Department (1, "Sales"))));
		list.add(new Employee(20, "Ram", (new Department (2, "Maketing"))));
		list.add(new Employee(30, "Laxman", (new Department (3, "Sales"))));
		
		for (Employee s : list) 
        {
            System.out.println(s.getEmpno()+" "+s.getEmpname()+" " +s.getDept().getDeptid()+" "+s.getDept().getDeptname());
        }
		System.out.println("\nEmployee with empon 10");
		for(Employee s : list)
		{
			if(s.empno==10)
			{
				System.out.println(s.getEmpno()+" "+s.getEmpname()+" " +s.getDept().getDeptid()+" "+s.getDept().getDeptname());
				
			}
			
		}

	}

}
