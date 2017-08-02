package chapter03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BackJoon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<String> leftCards = new ArrayList<>();
		
		int requiredCardsSet = 0;

		String num = sc.nextLine();
		
		for(int i=0; i<num.length(); i++) {
			
			String testNum = num.substring(i, i+1);
			
			if(leftCards.contains(testNum)) {
				leftCards.remove(testNum);
			} else if((testNum.equals("6")&&leftCards.contains("9")) || (testNum.equals("9")&&leftCards.contains("6"))) {
				if(testNum.equals("6")&&leftCards.contains("9")) {
					leftCards.remove("9");
				} else {
					leftCards.remove("6");
				}
			} else {
				for(int j=1; j<=9; j++) {
					if(j != Integer.parseInt(testNum)) {
						leftCards.add(String.valueOf(j));
					}
				}
				requiredCardsSet++;
			}
			Iterator<String> it = leftCards.iterator();
			while(it.hasNext()) {
				System.out.print(it.next());
			}
			System.out.println();
		}
		
		System.out.println(requiredCardsSet);
		Object b = new Object();
		b.getClass();
	}
}



