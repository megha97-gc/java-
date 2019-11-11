package constructor;

public class Loan {
	String name;
	double roi;
	Loan(String name, double roi)
	{
		this.name=name;
		this.roi=roi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l1=new Loan("Home Loan",5000);
		Loan l2=new Loan("Personal Loan",1500);
		Loan l3=new Loan("Car Loan",4000);
		System.out.println("Name:"+l1.name+" roi:"+l1.roi);
		System.out.println("Name:"+l2.name+" roi:"+l2.roi);
		System.out.println("Name:"+l3.name+" roi:"+l3.roi);
	}

}
