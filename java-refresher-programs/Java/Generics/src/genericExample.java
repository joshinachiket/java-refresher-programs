import java.util.Scanner;

public class genericExample {
	
	public static void generateMenu() {

		System.out.println("Please enter do you want to do!");
		System.out.println("1. ADD A BOOK IN PRIZE POOL!");
		System.out.println("2. SEARCH FOR PRIZE OF YOUR BOOK!");
		System.out.println("3. SHOW ENTIRE LIBRARY POOL");

	}
	
	public static int getInput() {
		int choice;
		Scanner sc = new Scanner(System.in);
		try{
			choice = Integer.parseInt(sc.next());
		}catch(Exception E){
			System.out.println("Please enter a NUMBER as the menu says!");
			return 10;
		}	
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateMenu();
		book_store bs = new book_store();
		int choice = getInput();
		while(choice>0){
			switch(choice){
			case 1:
				bs.askBookDetails();
				break;
			case 2:
				bs.searchBookDetails();
				break;
			case 3:
				bs.show();
				break;
			default:
				System.out.println("!!!Invalid Choice!!!");
			}
			generateMenu();
			choice =  getInput();
		}
	}

}
