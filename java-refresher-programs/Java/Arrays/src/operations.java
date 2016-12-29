import java.util.*;
public class operations {
	int[] sampleArray;
	Scanner input = new Scanner(System.in);
	int len;
	
	public boolean isEmpty(){
		if (sampleArray.length==0)
				return true;
		else
			return false;
	}
	
	public int create(){
		int i;
		System.out.println("Please enter the length of array.");
		len = input.nextInt();
		sampleArray = new int[len];
		System.out.println("Please enter the elements of the array.");
		for(i=0;i<len;i++){
			System.out.println("*Enter Element Number at position: "+ i);
			sampleArray[i] = input.nextInt();
		}
		return len;
		
}
	
	public void delete(){
		int i, position;
		System.out.println("Please enter the position of the element of array you want to delete!");
		position = input.nextInt();
		position--;
		
		if((position<0) || (position>len-1)){
			System.out.println("Entered position does not exist in the array");
		}
		else{
			System.out.println(len);
			for(i=position;i<len-1;i++){
				sampleArray[i]=sampleArray[i+1];
			}
			len--;
		}
}
	
	public void display(){
		int count =0;
		try{
			for(count=0;count<len;count++){
				System.out.println(sampleArray[count]);
				
			}			
		}
		catch(Exception E){
			System.out.println("The array has length 0. Please create anarray first!");
		}

}
	
	public void rotation() {
		System.out.println("1. Left");
		System.out.println("2. Right");
		int choice, i, temp, j;
		choice = input.nextInt();
		if (choice==1){
			temp = sampleArray[0];
			for(i=0;i<len-1;i++){
				sampleArray[i]=sampleArray[i+1];
			}
			sampleArray[len-1]=temp;
		}
		else if(choice ==2){
			temp = sampleArray[len-1];
			for(j=len-1;j>0;j--){
				sampleArray[j]=sampleArray[j-1];
			}
			sampleArray[0]=temp;
		}
		else{
			System.out.println("INVALID CHOICE!");
		}
	}
	
	public boolean search() {
		System.out.println("Enter the number to search in the array");
		int item, i, found=0;
		boolean ans = false;
		item= input.nextInt();
		for(i=0;i<len-1;i++){
			if(sampleArray[i]==item){
				System.out.println("Found at: "+ (i+1));
				found+=1;
				ans= true;
			}
		}
		if(found==0){
			System.out.println("Element Not Found");
			ans= false;
		}
		return ans;
	}
	
	public void reverse() {
		
		int i, j;
		int[] tempArray = new int[len];
		System.out.println("Array is reversed!");
		for(i=0;i<len;i++){
			tempArray[i]=sampleArray[i];
		}
		System.out.println("Array is reversed!");
		for(j=len-1;j>=0;j--){
			sampleArray[len-j-1]= tempArray[j];
		}
	}
}

