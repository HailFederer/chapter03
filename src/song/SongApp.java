package song;

public class SongApp {

	public static void main(String[] args) {

		Song song1 = new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
		song1.show();
		
		Song song2 = new Song("Chandelier", "Sia");
		song2.show();
	}
}
