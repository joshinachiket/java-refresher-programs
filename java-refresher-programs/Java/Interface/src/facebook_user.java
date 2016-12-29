
public class facebook_user implements new_user_profile{
	
	public boolean displayName(String sample){
		if (sample.equals("yes")){
			System.out.println("-------------------------------------");
			System.out.println("This is your FACEBOOK name");
			return true;
		}
		else return false;
	}
	
	public void displayProfilePic(){
		System.out.println("This is your FACEBOOK ProfilePic");
	}
	
	public String searchName(){
		System.out.println("---Search Logic---");
		System.out.println("This is your searched FACEBOOK name");
		return "searched element";
	}

	public String addBio(){
		System.out.println("This is your FACEBOOK bio");
		System.out.println("-------------------------------------");
		return "success";
	}
	
}
