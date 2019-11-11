package constructor;

public class Employee {
	String name;
	double salary;
	int id;
	Employee(String name, double salary, int id)
	{
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	public static void main(String[] args) {
		Employee e1=new Employee("arptiha",30000, 1);
		Employee e2=new Employee("abhishek",25000, 2);
		Employee e3=new Employee("deepak",40000, 3);
		System.out.println("Name: "+e1.name+"  Salary:"+e1.salary+"  ID:"+e1.id);
		System.out.println("Name:"+e2.name+"  Salary:"+e2.salary+"  ID:"+e2.id);
		System.out.println("Name :"+e3.name+"  Salary:"+e3.salary+"  ID:"+e3.id);
	}
	

}
