package cpnv.jav1.lima;

public class Gear extends Article{
	String _name;
	int _number;
	String _resp;
	String _supplier;
	Double _price;
	Double _VAT;
	String _size;

	public Gear(){
		 super();
		 _size = "U";
	}
	public Gear(Gear gear){
		super((Article) gear);
		setSize(gear._size);
	}
	public Gear(String name, int number, String resp, String supplier, Double price, Double vAT, String size) {
		super(name, number, resp, supplier, price, vAT);
		setSize(size);
	}
	
	public String getSize() {
		return _size;
	}
	public void setSize(String size) {
		_size = size;
	}
	
	public String dump(){
		return super._name+"-"+super._number+"-"+super._resp+"-"+super._supplier+"-"+super._price+"-"+super._VAT+"-"+_size;
	}
}
