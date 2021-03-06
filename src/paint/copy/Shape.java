package paint.copy;

abstract public class Shape implements Drawable{

	private String fillColor;
	private String lineColor;

	@Override
	abstract public void draw();

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
}
