package miltos.diploma;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product(){
		this.name = "";
		this.price = 0;
		this.quantity = 0;
	}
	
	public Product(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName(){
		return this.name;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
}
