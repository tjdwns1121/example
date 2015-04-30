package sds.icto55.example;

public class Ex2Main {

	public static void main(String[] args) {

		Ex2 camera = new Ex2();

		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		Ex2 goods2 = new Ex2("Nikon2", 100,200, 200000);

		System.out.println("상품이름 : " + camera.getName());
		System.out.println("상품가격 : " + camera.getPrice());
		System.out.println("재고수량 : " + camera.getCountStock());
		System.out.println("팔린개수 : " + camera.getCountSold());
		
	}
}