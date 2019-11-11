package objects;

public class Demo6 {
	void m1()
	{
		System.out.println("from m1()");

	}
	public static void main(String[] args) {
		System.out.println("from main of demo6");
		Demo6 x= new Demo6();
		x.m1();
		System.out.println("end main");
	}

	

}
