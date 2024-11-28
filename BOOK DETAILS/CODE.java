import java.util.*;
class Books
{
	String name;
	String author;
	int price;
	int numpages;
	Books(String name,String author,int price,int numpages)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.numpages=numpages;
	}
	public String toString()
	{
		String name,author,price,numpages;
		name="Book name:"+this.name+"\n";
		author = "Author name: " + this.author + "\n";
 		price = "Price: " + this.price + "\n";
 		numpages = "Number of pages: " + this.numpages + "\n";
 		return name + author + price + numpages;
 	}
}
class details
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		String name;
		String author;
		int price;
		int numpages;
		System.out.println("Enter the number of books:");
		n=s.nextInt();
		Books[] b=new Books[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the book name");
			name=s.next();
			System.out.println("Enter the author name:");
			author=s.next();
			System.out.println("Enter the price:");
			price=s.nextInt();
			System.out.println("Enter the number of pages:");
			numpages=s.nextInt();
			b[i]=new Books(name,author,price,numpages);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	System.out.println("LIKITH.TARAKARAM");
	System.out.println("1BM23CS171");
	}
}



		

