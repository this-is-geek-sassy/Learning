package saswata.patterns.factory.assignment;

public class PersonFactory {
	
	private static Person person;

	public static Person createPerson(String gender) {
		
		if (gender.equalsIgnoreCase("male")) {
			person = new Male();
		} else if (gender.equalsIgnoreCase("female")) {
			person = new Female();
		}
		return person;
	}
}
