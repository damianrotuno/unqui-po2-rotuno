package ar.edu.unq.po2.tp3;

public class Square extends Rectangle {
	
	public void setWidth() {
		setWidth(this.getLength());
	}
	
	public void setMeasures(int x) {
		this.setLength(x);
		this.setWidth();
	}
}
