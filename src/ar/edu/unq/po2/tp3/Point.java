package ar.edu.unq.po2.tp3;

public class Point {

		int x;
		int y;
		Point newPoint;
	
		public Point(int x, int y) {
			this.setValues(x,y);
		}
		
		public Point() {
			this.x = 0;
			this.y = 0;
		}

		private void setValues(int x, int y ) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
		
		public void movePointTo(int x, int y) {
			this.setValues(x, y);
		}
		
		public void addPoint(Point p) {
			int a = this.x + p.x;
			int b = this.y + p.y;
			newPoint = new Point(a,b);

		}
		
		public Point getNewPoint() {
			return newPoint;
		}
			
		
}
