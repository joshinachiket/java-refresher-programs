
public class scientist implements Runnable{

	private Thread thread;
	private String threadName;
	
	//creating an operation thread
	scientist(String operationName){
		threadName = operationName;
		System.out.println("The thread currenltly getting CREATED is for operation : "+ threadName);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The thread currenltly RUNNING is for operation : " + threadName);

		try{
			for(int i=0; i<10;i++){
				System.out.println("scientist operation that prints: " + i +" is :" + threadName);
				Thread.sleep(50);
			}
			
		}
		catch(InterruptedException E){
			System.out.println("The thread currenltly INTERRUPTED is for operation : " + threadName);
		}
		System.out.println("The thread currenltly EXITING is for operation : " + threadName);
		
	}
	
	public String start(){
		System.out.println("The thread currenltly STARTING is for operation : " + threadName);

		if(thread==null){
			thread = new Thread(this, threadName);
			thread.start();
		}
		return threadName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scientist s1 = new scientist("Operation - 1");
		s1.start();
		scientist s2 = new scientist("Operation - 2");
		s2.start();
	}

}
