package ar.edu.unq.po2.tp3;

public class Multiples {
	private int number = 1000;
	
	public boolean isMultiplotOf(int x, int y) {
		if(x%y == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int majorMultiplotBetween(int x, int y) {
		while(! this.isMultiplotOf(number, x) 
				&& ! this.isMultiplotOf(number, y)
				&& number > -2) {
			
			number--;
		}
		
			return number;
	}
}
