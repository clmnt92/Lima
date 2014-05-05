package cpnv.jav1.lima;

public class Book extends Article{
	String _name;
	int _number;
	String _resp;
	String _supplier;
	Double _price;
	Double _VAT;
	int _isbn;

	public Book(){
		 super();
		 _isbn = 0;
	}
	public Book(Book book){
		super((Article) book);
		setISBN(book._isbn);
	}
	public Book(String name, int number, String resp, String supplier,
			Double price, Double vAT, int isbn) {
		super(name, number, resp, supplier, price, vAT);
		setISBN(isbn);
	}
	
	public int getISBN() {
		return _isbn;
	}

	public void setISBN(int isbn) {
		if(Integer.toString(isbn).length() < 6){
			_isbn = 0;
		}
		else{
			_isbn = isbn;	
		}
		
	}
	
	public String dump(){
		//"XML For Dummies-3300-Bernard-Payot-33.3-8.0-987654321"
		return _name+"-"+_number+"-"+_resp+"-"+_supplier+"-"+_price+"-"+_VAT+"-"+_isbn;
	}
	
}
