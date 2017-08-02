package paint.copy;

public class PaintApp {

	public static void main(String[] args) {

		Point point1 = new Point(2, 3);
		Point point2 = new ColorPoint(3, 4, "red");
		
		point1.draw();
		point2.draw();
		
		draw(new ColorPoint(4, 5, "yellow"));
		
		Shape triangle = new Triangle(1,2,3,4,5,6);
		draw(triangle);
	}
	
	private static void draw(Drawable drawing) {
		drawing.draw();
	}
	
	/*private static void drawPoint(Point point) {
		point.show();
	}
	
	private static void drawShape(Shape shape) {
		shape.draw();
	}*/
}
