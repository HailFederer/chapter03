package chapter03;

public class ArrayUtilTest {

	public static void main(String[] args) {

		int[] a = {10,20,30,40,50};
		double[] d = ArrayUtil.intToDouble(a);
		
		for(double value : d) {
			System.out.println(value);
		}

		int[] b = {60,70,80,90,100};
		int[] i = ArrayUtil.concat(a, b);
		
		for(int value : i) {
			System.out.print(value);
		}
	}
}
