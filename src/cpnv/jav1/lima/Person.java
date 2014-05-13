/**
 * Class Person, represent a human entity within the CPNV
 */
package cpnv.jav1.lima;

import java.util.Date;

/**
 * @author Elie.TURC
 *
 */
public abstract class Person {

	String _lastName;
	String _firstName;
	String _birthDate;
	
	public Person(){
		
	}
	public Person(String lastName, String firstName, String birthDate) {
		super();
		_lastName = lastName;
		_firstName = firstName;
		_birthDate = birthDate;
	}
	protected String getLastName() {
		return _lastName;
	}
	protected void setLastName(String lastName) {
		_lastName = lastName;
	}
	protected String getFirstName() {
		return _firstName;
	}
	protected void setFirstName(String firstName) {
		_firstName = firstName;
	}
	protected  String getBirthDate() {
		return _birthDate;
	}
	protected abstract void setBirthDate(String birthDate);
	
	protected String dump(){
		String firstNameUP = _firstName.replaceFirst(".", (_firstName.charAt(0)+"").toUpperCase());
		return firstNameUP+" "+_lastName.toUpperCase();
	}
}
