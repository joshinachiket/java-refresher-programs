import java.util.*;

public class exampleQueues {

	public static void generateMenu () {
		System.out.println("Please enter what you want to do!");
		System.out.println("1. Ask For today's attendance!");
		System.out.println("2. Peek the HEAD of the QUEUE!");
		System.out.println("3. Display Early Employees!");
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
		int TotEmp, choice;
		Scanner input;
		attendance atd = new attendance();
		generateMenu();
		input = new Scanner(System.in);
		choice = getInput();
		while (choice > 0) {
			switch (choice) {
			case 1:
				TotEmp = atd.getNumberOfEmp();
				atd.queueUsingLinkedList(TotEmp);
				break;
			case 2:
				atd.inspectElement();
				break;
			case 3:
				atd.disEarlyEmp();
				break;
			default:
				System.out.println("!!!Invalid Choice!!!");
			}
            generateMenu();
            choice =  getInput();;
		}

	}

}
