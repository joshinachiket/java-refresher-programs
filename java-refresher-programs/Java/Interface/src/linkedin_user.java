
public class linkedin_user implements new_user_profile {
	
	public boolean displayName(String sample){
		boolean ans=false;
		if (sample.equals("yes")){
			System.out.println("-------------------------------------");
			System.out.println("This is your LINKEDIN name");
			ans= true;
		}
		else ans= false;
		return ans;
		
	}
	
	public void displayProfilePic(){
		System.out.println("This is your LINKEDIN ProfilePic");
	}
	
	public String searchName(){
		System.out.println("---Search Logic---");
		System.out.println("This is your searched LINKEDIN name");
		return "searched element";
	}
	
	public void showCurrentJob(){
		System.out.println("This is your current JOB");
	}
	
	public int lastVisitor(){
		System.out.println("Person XYZ is your last visitor to your profile");
		System.out.println("-------------------------------------");
		return 10;
	}
}
