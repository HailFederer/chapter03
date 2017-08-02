package paint;

public class PaintApp {

	public static void main(String[] args) {

		Point point1 = new Point(2, 3);
		Point point2 = new ColorPoint(3, 4, "red");
		
		point1.show();
		point2.show();
		
		drawPoint(new ColorPoint(4, 5, "yellow"));
		
		Shape triangle = new Triangle(1,2,3,4,5,6);
		drawShape(triangle);
	}
	
	private static void drawPoint(Point point) {
		point.show();
	}
	
	private static void drawShape(Shape shape) {
		shape.draw();
	}
}
