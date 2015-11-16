package whatever;

import java.util.HashSet;
import java.util.Set;

public class SetTutorial {

	public static void main(String[] args) {
		
		Set<String> mySet= new HashSet<String>();
		
		mySet.add("Saki");
		mySet.add("Sadat");
		mySet.add("Sieam");
		
		
		Object[] array = mySet.toArray();
		
		System.out.println(array[2]);
	
				
	}

}
