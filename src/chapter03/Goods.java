package chapter03;

public class Goods {
	
	private static int countOfGoods;
	private static final double discount_rate = 0.3;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods() {
		
		Goods.countOfGoods++;
	}

	public Goods(String name, int price, int countStock, int countSold) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}

	public static int getCountOfGoods() {
		return countOfGoods;
	}

	public static void setCountOfGoods(int countOfGoods) {
		Goods.countOfGoods = countOfGoods;
	}

	void showInfo() {
		System.out.println("name:"+this.name+", price:"+this.price+", countStock:"
				+this.countStock+", countSold:"+this.countSold);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}
}
