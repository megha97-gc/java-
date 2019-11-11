package objects;

public class Demo5 {
	void m1()
	{
		System.out.println("from m1()");
	System.out.println(this);
	}
	public static void main(String[] args) {
		System.out.println("from main of demo5");
		Demo5 x= new Demo5();
		System.out.println(x);
		System.out.println("end main");
	}

}
