import java.util.*;

public class exampleArrays {
	
	public static void generateMenu() {

		System.out.println("Please enter what you want to do!");
		System.out.println("1. CREATE");
		System.out.println("2. DELETE");
		System.out.println("3. ROTATION");
		System.out.println("4. SEARCH");
		System.out.println("5. REVERSE");
		System.out.println("6. DISPLAY");

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
		operations ao = new operations();
		int choice = getInput();
		while(choice>0){
			switch(choice){
			case 1:
				ao.create();
				break;
			case 2:
				ao.delete();
				break;
			case 3:
				ao.rotation();
				break;
			case 4:
				ao.search();
				break;
			case 5:
				ao.reverse();
				break;
			case 6:
				ao.display();
				break;
			default:
				System.out.println("!!!Invalid Choice!!!");
			}
			generateMenu();
			choice =  getInput();
		}

	}

}
