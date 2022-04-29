package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperator {
	
	private ArrayList<Integer> listOfNumbers = new ArrayList();
	
	public void addNumber(int number) {
		listOfNumbers.add(number);
	}
	
	public int addThemAll() {
		int n = 0;
		int i;
		
		for(i=0; i<listOfNumbers.size(); i++) {
			n+=listOfNumbers.get(i);
		}
		
		return n;
	}
	
	public int substracAll() {
		int i;
		int n = 0;
		
		for(i=0; i<listOfNumbers.size(); i++) {
			n-=listOfNumbers.get(i);
		}
		
		return n;
	}
	
	public int multipliesAll() {
		int n = 1;
		int i;
		
		for(i=0; i<listOfNumbers.size(); i++) {
			n*=listOfNumbers.get(i);
		}
		
		return n;
	}
		
	
}

	

