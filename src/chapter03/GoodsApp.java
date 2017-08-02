package chapter03;

import myPackage.Goods2;

public class GoodsApp {

	public static void main(String[] args) {

		Goods goods = new Goods("nikon", 200000, 10, 100);
		
		System.out.println(goods);
		
		Goods2 goods2 = new Goods2("기무띠", 1, 10, 100);
		System.out.println(goods2);
		
		// static 변수 테스트
		new Goods();
		System.out.println(Goods.getCountOfGoods());
		new Goods();
		System.out.println(Goods.getCountOfGoods());
		new Goods();
		System.out.println(Goods.getCountOfGoods());
		
	}
}
