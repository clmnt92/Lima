package cpnv.jav1.lima;

public class Article {
	String _name;
	int _number;
	String _resp;
	String _supplier;
	Double _price;
	Double _VAT;
	
	public Article(){
		 _name = "(à définir)";
		 _number = 0;
		 _resp = "(à définir)";
		 _supplier = "(à définir)";
		 _price = 0.0;
		 _VAT = 0.0;
	}
	
	public Article(Article article){
		setName(article.getName());
		setNumber(article.getNumber() + 1);
		setResp(article.getResp());
		setSupplier(article.getSupplier());
		setPrice(article.getPrice());
		setVAT(article.getVAT());
	}
	
	public Article(String name, int number, String resp, String supplier,
			Double price, Double vAT) {
		super();
		setName(name);
		setNumber(number);
		setResp(resp);
		setSupplier(supplier);
		setPrice(price);
		setVAT(vAT);
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		if(name.length() <= 3){
			_name = "(à définir)";
		}
		else{
			_name = name;
		}
	}
	public int getNumber() {
		return _number;
	}
	public void setNumber(int number) {
		if(number <= 0){
			_number = 0;
		}
		else{
			_number = number;	
		}
	}
	public String getResp() {
		return _resp;
	}
	public void setResp(String resp) {
		if(resp.length() <= 3){
			_resp = "(à définir)";
		}
		else{
			_resp = resp;
		}
	}
	public String getSupplier() {
		return _supplier;
	}
	public void setSupplier(String supplier) {
		if(supplier.length() <= 3){
			_supplier = "(à définir)";
		}
		else{
			_supplier = supplier;	
		}
		
	}
	public Double getPrice() {
		return _price;
	}
	public void setPrice(Double price) {
		if(price <= 0){
			_price = 0.0;
		}
		else{
			_price = price;
		}
	}
	public Double getVAT() {
		return _VAT;
	}
	public void setVAT(Double vAT) {
		if(vAT <= 0){
			_VAT = 0.0;
		}
		else{
			_VAT = vAT;
		}
	}
	
	public String dump(){
		return _name+"-"+_number+"-"+_resp+"-"+_supplier+"-"+_price+"-"+_VAT;
	}
}
