import java.util.*;
public class book_store {
	Scanner input = new Scanner(System.in);
	List<String> Book_Pool = 	new ArrayList<String>();
	
	public void askBookDetails(){
		System.out.println("Enter the name of the book");
		Book_Pool.add(input.next());
		System.out.println("Enter the prize of the book");
		Book_Pool.add(input.next());
		System.out.println("Details of the book have been added to the library pool!");
	}
	
	public void searchBookDetails(){
		String B_Name;
		System.out.println("Enter the book you want to search the prize of!");
		B_Name = input.next();
		boolean B_Found = Book_Pool.contains(B_Name);
		if(B_Found){
			System.out.println("We found the book in our library and the prize is:");
			showPrize(B_Name, Book_Pool.indexOf(B_Name));
		}
		else{
			System.out.println("The entered book is not ou library pool!");
		}
	}
	
	public <E> void showPrize(E Book_Prize, int index){
		int ind= index+1;
		System.out.println(ind);
		System.out.println("BOOK: "+ Book_Prize + " PRIZE: " + Book_Pool.get(ind));
		
	}
	
	public <S> void showPool(List<String> Book_Pool){
		int i=0;
		
		System.out.println(Book_Pool);
		for(i=0;i<Book_Pool.size();i=i+2){
			System.out.println("BOOK: " + Book_Pool.get(i) + " PRIZE: " + Book_Pool.get(i+1));
		}
		/*for(String Element : Book_Pool){
			System.out.println(Element);
		}*/
	}
	
	public void show(){
		showPool(Book_Pool);
	}
	
	public int numberOfPages(String BookName){
		int No_Of_Pages = 520;
		System.out.println("--Logic TO Know Total Pages in Book---");
		return No_Of_Pages;
	}
	
	public String searchBook(String BookName){
		String Name_Of_Book = "name";
		System.out.println("--Logic TO search the book in bookpool---");
		return Name_Of_Book;
	}
		
}
