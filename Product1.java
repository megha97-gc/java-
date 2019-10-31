package product;

public class Product1 {
	public static void main(String[] args) {
		prod(3,5);
		prod(3,7,8);
		prod(2.5,1.3);
	}
	public static void prod(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void prod(int a,int b,int c )
	{
		System.out.println(a*b*c);
	}
	public static void prod(double d1,double d2)
	{
		System.out.println(d1*d2);
	}

}
