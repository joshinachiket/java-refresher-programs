import java.util.*;

public class stackExample {

	public static void generateMenu() {

		System.out.println("Please enter what you want to do!");
		System.out.println("1. Go TO A WEBSITE");
		System.out.println("2. BACK");
		System.out.println("3. SEARCH IF YOU VISITED A WEBSITE");
		System.out.println("4. LIST ALL WEBSITES");
		System.out.println("5. CHECK THE LAST VISITED WEBSITE");
		System.out.println("Any other number to quit");

	}

	public static int getInput() {
		int choice;
		Scanner sc = new Scanner(System.in);
		try{
			choice = Integer.parseInt(sc.next());
		}catch(Exception E){
			System.out.println("Please enter a number as the menu says!");
			return 10;
		}	
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			generateMenu();
			browser br= new browser();
			int choice = getInput();
			while(choice>0){
				switch(choice){
				case 1:
					br.goToWebsite();
					break;
				case 2:
					br.goBack();
					break;
				case 3:
					br.searchWebsites();
					break;
				case 4:
					br.listWebsites();
					break;
				case 5:
					br.checkLastWebsite();
					break;
				default:
					System.out.println("!!!Invalid Choice!!!");
				}
				generateMenu();
				choice =  getInput();
			}		
		}
		
	}