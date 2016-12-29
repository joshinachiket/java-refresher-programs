import java.util.*;

public class attendance {

	String EmpAns, EmpName;
	Scanner InpLen, InpName;
	int TotEmp, MethodChoice;
	Queue<String> AtendQ = new LinkedList<String>();
	
	public boolean isQueueEmpty(){
		if(AtendQ.isEmpty())
			return true;
		else
			return false;	
	}

	public boolean isQueueFull(Queue SampleAtendQ, int TotalEmp){
		if(SampleAtendQ.size()== TotalEmp)
			return true;
		else
			return false;
	}
	
	public int returnQueueSize(Queue SampleAtendQ){
		return SampleAtendQ.size();
	}
	
	public int getNumberOfEmp() {
		InpLen = new Scanner(System.in);
		System.out.println("Please enter the number of employees in todays shift!");
		TotEmp = InpLen.nextInt();
		return TotEmp;
	}

	public void queueUsingLinkedList(int TotEmp) {
		InpName = new Scanner(System.in);

		while (TotEmp > 0) {
			System.out.println("Are you employee in today's shift? (yes/no)");
			EmpAns = InpName.next();
			switch (EmpAns) {
			case "yes":
			case "YES":
			case "Yes":
				System.out.println("Please type your name to mark your attendance!");
				EmpName = InpName.next();
				AtendQ.add(EmpName);
				System.out.println("Your attendance is done!");
				System.out.println("Employees remaining to mark today's attendance are: " + (TotEmp - 1));
				TotEmp--;
				break;
			case "NO":
			case "No":
			case "no":
				System.out.println("Welcome Visitor this is not your shift so no attendance for you!");
				break;
			default:
				System.out.println(" This is invalid input please input only yes or no");
			}
		}
		System.out.println("Today's shift attendacne is done!");

	}

	public void disEarlyEmp() {
		System.out.println("Please enter the method you want to use to find top three employees!");
		System.out.println("1. By Using POLL method");
		System.out.println("2. By Using REMOVE method");
		MethodChoice = InpName.nextInt();
		System.out.println("MethodChoice: " + MethodChoice);
		switch (MethodChoice) {
		case 1:
			System.out.println("The top three early employees from today's shift using POLL are:");
			System.out.println("1. " + AtendQ.poll());
			System.out.println("2. " + AtendQ.poll());
			System.out.println("3. " + AtendQ.poll());
			System.out.println("POLL method returns NULL when encountered with an exception.");
			break;
		case 2:
			try {
				System.out.println("The top three early employees from today's shift using REMOVE are:");
				System.out.println("1. " + AtendQ.remove());
				System.out.println("2. " + AtendQ.remove());
				System.out.println("3. " + AtendQ.remove());
			} catch (NoSuchElementException ex) {
				System.out.println("Exception Occured because 'REMOVE' method returns exception when QUEUE is empty!"
						+ ex.getMessage());
			}
			break;

		}

	}

	public void inspectElement() {
		System.out.println("Please enter the method you want to use to RETURN head of the QUEUE!");
		System.out.println("1. By Using PEEK method");
		System.out.println("2. By Using ELEMENT method");
		MethodChoice = InpName.nextInt();
		System.out.println("MethodChoice: " + MethodChoice);
		switch (MethodChoice) {
		case 1:
			System.out.println("The head of the QUEUE is returned through PEEK method");
			System.out.println("1. " + AtendQ.peek());
			System.out.println("PEEK method returns NULL when encountered with an exception.");
			break;
		case 2:
			try {
				System.out.println("The head of the QUEUE is returned through ELEMENT method");
				System.out.println("1. " + AtendQ.element());
			} catch (NoSuchElementException ex) {
				System.out.println("Exception Occured because 'ELEMENT' method returns exception when QUEUE is empty!"
						+ ex.getMessage());
			}
			break;

		}

	}
}
