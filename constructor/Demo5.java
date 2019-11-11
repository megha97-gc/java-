package constructor;

public class Demo5 {
	Demo5()
	{
		System.out.println("from Demo5()");
	}
	Demo5(int i,int j)
	{
		System.out.println("from Demo5(int,int)");
	}
	public static void main(String[] args) {
		Demo5 ob1=new Demo5();
		Demo5 ob2=new Demo5(10,20);
		Demo5 ob3=new Demo5(30,40);
	}

}
