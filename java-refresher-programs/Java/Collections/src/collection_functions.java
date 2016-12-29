import java.util.*;

public class collection_functions {
	Set<Integer> set_example = new HashSet<Integer>();
	Set<Integer> set_example_sample = new HashSet<Integer>();
	Scanner input = new Scanner(System.in);
	int len;
	int element[];
	int sample_Array[] = {1,2,3,4,5,6,7,8,9};
	
	public int knowArray(){
		int i;
		System.out.println("Please enter the length of the Array to add in set.");
		len = input.nextInt();
		element = new int[len];
		System.out.println("Please enter the elements of the array.");
		for(i=0;i<len;i++){
			System.out.println("*Enter Element Number at position: "+ i);
			element[i]= input.nextInt();
		}
		return len;
	}
	
	public void createHashset(){
	int i=0;
	try{
		for(i=0;i<element.length;i++){
			set_example.add(element[i]);
		}
		System.out.println("Array Created!");
	}
	catch(Exception E){
		System.out.println("Exception Excountered!");
		}
	}
	
	public void showSetArray(){
		int i=0;
		Iterator Iterator = set_example.iterator();
		for(i=0;i<element.length;i++){
			System.out.println("Element at : "+ i +" in ARAY : "+ element[i] );
		}
		while(Iterator.hasNext()){
			System.out.println("Element at: "+ i +" in SET : "+ Iterator.next() );
		}
	}
	
	public boolean emptySet(){
		if(set_example.isEmpty())
			return true;
		else
			return false;
	}
	
	public String emptyArray(){
		set_example.clear();
		return "success";
	}
	
	public int sizeOfSet(){
		return set_example.size();
	}
	
	public boolean removeSetElement(){
		int remove_element;
		System.out.println("Please enter the element to delete:");
		remove_element = input.nextInt();
		if(set_example.contains(remove_element)){
			set_example.remove(remove_element);
			return true;
		}
		else{
			System.out.println("Element not in SET");
			return false;
		}
	}
	
	public void unionSet(){
	    int i=0;
		try {
	    	for(i = 0; i < sample_Array.length; i++) {
	    	set_example_sample.add(sample_Array[i]);
	    	}
	    }
	    catch(Exception E){
	    	System.out.println("Exception Excountered ONE!");
	    }
		Set<Integer> Union_Set = new HashSet<Integer>(set_example_sample);
		Union_Set.addAll(set_example);

		Iterator Iterator_thr = Union_Set.iterator();
		while(Iterator_thr.hasNext()){
			System.out.println("Union_Set : "+ Iterator_thr.next() );
		}
	}
	
	public void intersectSet(){
	    int i=0;
		try {
	    	for(i = 0; i < sample_Array.length; i++) {
	    	set_example_sample.add(sample_Array[i]);
	    	}
	    }
	    catch(Exception E){
	    	System.out.println("Exception Excountered ONE!");
	    }
		Set<Integer> Intersection_Set = new HashSet<Integer>(set_example_sample);
		Intersection_Set.retainAll(set_example);

		Iterator Iterator_thr = Intersection_Set.iterator();
		while(Iterator_thr.hasNext()){
			System.out.println("Intersection_Set : "+ Iterator_thr.next() );
		}
	}
	
	public void differenceSet(){
	    int i=0;
		try {
	    	for(i = 0; i < sample_Array.length; i++) {
	    	set_example_sample.add(sample_Array[i]);
	    	}
	    }
	    catch(Exception E){
	    	System.out.println("Exception Excountered ONE!");
	    }
		Set<Integer> Difference_Set = new HashSet<Integer>(set_example_sample);
		Difference_Set.removeAll(set_example);

		Iterator Iterator_thr = Difference_Set.iterator();
		while(Iterator_thr.hasNext()){
			System.out.println("Difference_Set : "+ Iterator_thr.next() );
		}
	}
	
	
}



