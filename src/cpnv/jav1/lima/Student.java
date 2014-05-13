package cpnv.jav1.lima;

import java.text.DateFormat;
import java.util.Date;

public class Student extends Person {

	protected int _startYear;
	public int getStarYear() {
		return _startYear;
	}

	protected void setStartYear(int startYear) {
		_startYear = startYear;
	}

	protected Student() {
		_firstName = "firstname";
		_lastName = "lastname";
		String nowDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date());
		_birthDate = nowDate;
	}

	protected Student(String lastName, String firstName, String birthDate) {
		super(lastName, firstName, birthDate);
		// TODO Auto-generated constructor stub
	}
	
	protected String dump(){
		String firstNameUP = _firstName.replaceFirst(".", (_firstName.charAt(0)+"").toUpperCase());
		return firstNameUP+" "+_lastName.toUpperCase()+"("+_startYear+")";
	}

}
