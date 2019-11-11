package constructor;

public class Boxoffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie b1=new Movie("abc", 5, 1967);
		Movie b2=new Movie("xyz", 4.5, 2016);
		Movie b3=new Movie("pqr", 4, 2011);
		System.out.println("Name:"+b1.name+" Rating:"+b1.rating+" YOR:"+b1.yor);
		System.out.println("Name:"+b2.name+" Rating:"+b2.rating+" YOR:"+b2.yor);
		System.out.println("Name:"+b3.name+" Rating:"+b3.rating+" YOR:"+b3.yor);
		

	}

}
