package ar.edu.unq.po2.tp3;

public class Rectangle {
	
	private Point topLeft;
	private Point topRight;
	private Point bottomLeft;
	private Point bottomRight;
	
	private int width;
	private int length;
	private int area;
	private int perimeter;
	
	public void setWidth(int w) {
		width = w;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setLength(int l) {
		length = l;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setTopLeft(int x, int y) {
		topLeft = new Point(x,y);
	}
	
	public Point getTopLeft() {
		return topLeft;
	}
	
	public void setTopRight(int x, int y) {
		topRight = new Point(x,y);
	}
	
	public Point getTopRight() {
		return topRight;
	}
	
	public void setBottomLeft(int x, int y) {
		bottomLeft = new Point(x,y);
	}
	
	public Point getBottomLeft() {
		return bottomLeft;
	}
	
	public void setBottomRight(int x, int y) {
		bottomRight = new Point(x,y);
	}
	
	public Point getBottomRight() {
		return bottomRight;
	}
	
	public void setMeasure(int l, int w) {
		length = l;
		width = w;
	}
	
	public void create(int x, int y) {
		this.setTopLeft(x, y);
		this.setBottomLeft(x, y-this.width);
		this.setTopRight(x+this.length, y);
		this.setBottomRight(x+this.length, y-this.width);
	}
	
	public void setArea() {
		area = length * width;
	}
	
	public int getArea() {
		return area;
	}
	
	public void setPerimeter() {
		perimeter = (length*2) + (width*2);
	}
	
	public int getPerimeter(){
		return perimeter;
	}
	
	public boolean isHorizontal() {
		if(length > width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}
