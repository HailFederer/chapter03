package chapter03;

public class SwapTest {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		
		System.out.println("i="+i+", j="+j);
		swap(i, j);
		System.out.println("i="+i+", j="+j);
		
		Value<Integer> v1 = new Value<Integer>();
		v1.setValue(10);
		Value<Integer> v2 = new Value<Integer>();
		v2.setValue(20);
		System.out.println("v1="+v1.getValue()+", v2="+v2.getValue());
		swap2(v1, v2);
		System.out.println("v1="+v1.getValue()+", v2="+v2.getValue());
		
		Value<String> v3 = new Value<String>();
		v3.setValue("a");
		Value<String> v4 = new Value<String>();
		v4.setValue("b");
		System.out.println("v3="+v3.getValue()+", v4="+v4.getValue());
		swap2(v3,v4);
		System.out.println("v3="+v3.getValue()+", v4="+v4.getValue());
		
	}
	
	public static void swap(int a, int b) {
		
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static <T> void swap2(Value<T> a, Value<T> b) {
		T temp = a.getValue();
		a.setValue(b.getValue());
		b.setValue(temp);
	}
}
