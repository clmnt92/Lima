package cpnv.jav1.lima;

public class ClassTeacher extends Teacher {

	String _classe;
	
	public ClassTeacher(Teacher teacher) {
		setClasse(_classe);
	}

	public ClassTeacher(String lastName, String firstName, String birthDate,String section) {
		super(lastName, firstName, birthDate, section);
		
	}

	public String getClasse() {
		return _classe;
	}

	public void setClasse(String classe) {
		_classe = classe;
	}

}
