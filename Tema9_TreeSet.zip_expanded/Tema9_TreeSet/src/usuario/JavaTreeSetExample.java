package usuario;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class JavaTreeSetExample {

	public static void main(String[] args) {
		
		
		//Putting Custom Objects in Sorted Order
		TreeSet<User> userSet = new TreeSet<User>();	
		populateUser(userSet);
		
		System.out.println("** Users based on first name **");
		System.out.println(userSet.toString());
		
		//Iterating over TreeSet using for loop
		System.out.println("** Iterating using for loop **");
		for(User user : userSet){
			System.out.println(user.getFirstName());
		}
		
		
		//Iterating over TreeSet using Iterator
		System.out.println("** Iterating using Iterator **");
		Iterator<User> iterator = userSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		Set<User> userSetBasedOnSalary = new TreeSet<User>(new UserSalaryComparator());
		populateUser(userSetBasedOnSalary);
		System.out.println("** Users based on salary **");
		System.out.println(userSetBasedOnSalary.toString());
		
	}

	private static void populateUser(Set<User> userSet) {
		userSet.add(new User("Anirudh","Bhatnagar",100));
		userSet.add(new User("Jack","Daniel",150));
		userSet.add(new User("Kate","Xyz",120));
		userSet.add(new User("Bosco","Ceasor",140));
		userSet.add(new User("Alberto","Carrera",120));
		userSet.add(new User("Jack","Chan",190));
	}
}
