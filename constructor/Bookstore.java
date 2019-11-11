package constructor;

public class Bookstore {
	public static void main(String[] args) {
		
	Books b1=new Books("half girlfriend",100,12);
	Books b2=new Books("the wings of fire",500,13);
	Books b3=new Books("romeo juliet",200,10);
	Books b4=new Books("get out",150,14);
	Books b5=new Books("118",400,15);
	Books[] rack= {b1,b2,b3,b4,b5}; 
	for(int i=0;i<rack.length;i++)
	{
		System.out.println(rack[i].name+" "+rack[i].price+" "+rack[i].isbn);
		rack[i].genre("lovestory");
	}

}
}
