import java.util.Scanner;

public class IterfaceExample {
	
	public static void generateMenu() {

		System.out.println("Please enter what user are you!");
		System.out.println("1. FACEBOOK");
		System.out.println("2. LINKEDIN");

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
		facebook_user fu = new facebook_user();
		linkedin_user lu = new linkedin_user();
		int choice = getInput();
		while(choice>0){
			switch(choice){
			case 1:
				fu.displayName("yes");
				fu.displayProfilePic();
				fu.searchName();
				fu.addBio();
				break;
			case 2:
				lu.displayName("yes");
				lu.displayProfilePic();
				lu.searchName();
				lu.showCurrentJob();
				lu.lastVisitor();
				break;
			default:
				System.out.println("!!!Invalid Choice!!!");
			}
			generateMenu();
			choice =  getInput();
		}

	}

}
