import java.util.Scanner;

public class collection {
	
	public static void generateMenu() {

		System.out.println("Please enter what you want to do!");
		System.out.println("1. CREATE ARRAY TO ADD IN A SET HASHMAP");
		System.out.println("2. ADD ARRAY TO SETMAP");
		System.out.println("3. SHOW ARRAY AND SETMAP TO COMPARE");
		System.out.println("4. EMPTY SET");
		System.out.println("5. REMOVE OBJECT FROM SET");
		System.out.println("6. UNION WITH SET: {1,2,3,4,5,6,7,8,9}");
		System.out.println("7. INTERSECTION WITH SET: {1,2,3,4,5,6,7,8,9}");
		System.out.println("8. DIFFERENCE WITH SET: {1,2,3,4,5,6,7,8,9}");


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
		collection_functions sf = new collection_functions();
		int choice = getInput();
		while(choice>0){
			switch(choice){
			case 1:
				sf.knowArray();
				break;
			case 2:
				sf.createHashset();
				break;
			case 3:
				sf.showSetArray();
				break;
			case 4:
				sf.emptyArray();
				break;
			case 5:
				sf.removeSetElement();
				break;
			case 6:
				sf.unionSet();
				break;
			case 7:
				sf.intersectSet();
				break;
			case 8:
				sf.differenceSet();
				break;
			default:
				System.out.println("!!!Invalid Choice!!!");
			}
			generateMenu();
			choice =  getInput();
		}

	}

}
