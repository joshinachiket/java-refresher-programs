import java.util.*;
public class browser {
	Scanner input = new Scanner(System.in);
	Stack<String> stk = new Stack<String>();
	public void goToWebsite(){
		System.out.println("-------------------");
		System.out.println("This is Your Browser! Please enter the website you want to visit!!!");
		System.out.println("-------------------");
		String WebsiteName;
		WebsiteName = input.next();
		stk.push(WebsiteName);
		System.out.println("***********************************");
		System.out.println("***********************************");
		System.out.println("This IS your website " + WebsiteName );
		System.out.println("***********************************");
		System.out.println("***********************************");
	}
	
	public void goBack(){
		System.out.println("-------------------");
		
		try{
			System.out.println("***********************************");
			System.out.println("***********************************");
			System.out.println("This WAS your website " + stk.pop() );
			System.out.println("***********************************");
			System.out.println("***********************************");
			System.out.println("-------------------");
			
		}
		catch(EmptyStackException E){
			System.out.println("You have hit the end of history");
			System.out.println("-------------------");
			
		}

	}
	
	public boolean searchWebsites(){
		System.out.println("-------------------");
		System.out.println("This is Search Websites Portal");
		System.out.println("Enter the name of the website to check if you have visited");
		String WebsiteName;
		int position;
		WebsiteName = input.next();
		if(stk.empty()){
			System.out.println("Nothing to show! The Browser stack is empty!!!");
			return false;
		}
		else{
			position = stk.search(WebsiteName);
			System.out.println("The element is at position "+ position + " from top of the stack!!!");
			System.out.println("-------------------");
			return true;
		}

	}
	
	public void listWebsites(){
		System.out.println("---------------------------------------");
		Iterator<String> itr = stk.iterator();
		if(stk.empty()){
			System.out.println("Nothing to show! The Browser stack is empty!!!");
		}
		else{

			System.out.println("This Is List Of Websites You Visited");
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
			
		}

		System.out.println("---------------------------------------");
	}
	
	public boolean checkLastWebsite(){
		try{
			System.out.println("---------------------------------------");
			System.out.println("The last visited website was "+ stk.peek());
			System.out.println("---------------------------------------");
			return true;
		}
		catch(EmptyStackException E){
			System.out.println("Nothing to show! The Browser stack is empty!!!");
			System.out.println("---------------------------------------");
			return false;
		}
	}
}
