package constructor;

public class Books {
	String name;
	int price;
	int isbn;
	Books()
	{
		
	}
  Books(String name,int price,int isbn)
  {
	  this.name=name;
	  this.price=price;
	  this.isbn=isbn;
  }
  void genre(String type)
  {
	  System.out.println(name+" is in "+type+" genre");
  }

}
