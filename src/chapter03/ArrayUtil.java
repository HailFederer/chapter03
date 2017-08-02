package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] source) {
		
		double[] dest = null;
				
		if(source != null) {
			
			int length = source.length;
			
			dest = new double[length];
			
			for(int i=0; i<length; i++) {
				dest[i] = source[i];
			}
		}
		
		return dest;
	}
	
	public static int[] concat(int[] s1, int[] s2) {
		
		int[] unitedArray = null;
		
		if(s1 != null && s2 != null) {
		
			unitedArray = new int[s1.length+s2.length];
			
			for(int i=0; i<s1.length; i++) {
				
				unitedArray[i] = s1[i];
			}
			for(int i=0; i<s2.length; i++) {
				
				unitedArray[i+s1.length] = s2[i];
			}
		}
		return unitedArray;
	}
}
