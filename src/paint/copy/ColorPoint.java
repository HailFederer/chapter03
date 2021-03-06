package paint.copy;

public class ColorPoint extends Point {
	
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Point [x=" + x + ", y=" + y 
		+ ", color="+ color + "]을 그렸습니다.");
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
