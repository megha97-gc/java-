package constructor;

public class Song {
	String name;
	String singer;
	Song(String name, String singer)
	{
		this.singer=singer;
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song s1=new Song("Gaganave","Shreya ghoshal");
		Song s2=new Song("tum hi ho","Arjit singh");
		Song s3=new Song("Ondu male billu","Arman malik");
		System.out.println("Name:"+s1.name+" Singer:"+s1.singer);
		System.out.println("Name:"+s2.name+" Singer:"+s2.singer);
		System.out.println("Name:"+s3.name+" Singer:"+s3.singer);

	}

}
