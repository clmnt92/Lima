package cpnv.jav1.lima;

import java.text.DateFormat;
import java.util.Date;

public class Teacher extends Person {

	String _section;
	
	//Getters & Setters
	protected String getSection() {
		return _section;
	}

	protected void setSection(String section) {
		_section = section;
	}
	
	protected final void SetBirthDate(String birthDate){
		_birthDate = birthDate;
	}

	//Constructors 
	protected Teacher() {
		_firstName = "firstname";
		_lastName = "lastname";
		String nowDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date());
		_birthDate = nowDate;
	}

	protected Teacher(String lastName, String firstName, String birthDate, String section) {
		super(lastName, firstName, birthDate);
		setSection(section);
		
	}
	
	//Methods
	protected String dump(){
		String firstNameUP = _firstName.replaceFirst(".", (_firstName.charAt(0)+"").toUpperCase());
		return firstNameUP+" "+_lastName.toUpperCase()+"("+_section+")";
	}

	@Override
	protected void setBirthDate(String birthDate) {
		// TODO Auto-generated method stub
		
	}
}
