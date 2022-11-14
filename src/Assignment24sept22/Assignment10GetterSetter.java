package Assignment24sept22;

class Department
{
	void Show() {
		System.out.println("Department");
	}
}

class Employee
{ private int id;
  private String name="HI";
  private Boolean ismanager;
  private float salary;
  Department dept;
 
  //ADD getter setter for Employee
  public void setId(int id) {
		this.id=id;
	}
  public void setName(String name) {
		this.name=name;
	}
  public void setIsManager(Boolean ismanager) {
		this.ismanager=ismanager;
	}
  public void setSalary(float salary) {
		this.salary=salary;
	}
  public void setDept(Department dept) {
		this.dept=dept;
	}
  public int getId() {
		return id;
	}
  public String getName() {
		return name;
	}
  public Boolean getIsManager() {
		return ismanager;
	}
  public Boolean getSalary() {
		return ismanager;
	}
  public Department getDept() {
		return dept;
	}
} 

public class Assignment10GetterSetter {

	public static void main(String[] args) {

	}

}
