package sds.icto55.example;

public class Ex2 {
	private String name;
	private int countStock;
	private int countSold;
	private int price;
	
	public Ex2(String name, int countStock, int countSold, int price){
		this.name = name;
		this.countStock = countStock;
		this.countSold = countSold;
		this.price = price;
	}
	public Ex2(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
}