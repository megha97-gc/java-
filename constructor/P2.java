package constructor;

public class P2 {
	int i=10;
	double b=12.3;
	P2()
	{
		System.out.println("from p2()");
		System.out.println(i);
		System.out.println(b);
		System.out.println(this.i);
		System.out.println(this.b);
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		P2 obj=new P2();
		System.out.println(obj.i);
		System.out.println(obj.b);
	}

}
