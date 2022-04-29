package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public int even() { 
		int even=0;
		int position=0;
		int i=0;
		
	while(list.size() > i ) { 						
			if(this.isEven((int) list.get(position))) {
				even++;
			}
			position++;		//Posicion de la lista
			i++;
		}
		
		return even;
	}
	
	public int odd() {
		int odd=0;
		
		odd = list.size() - this.even();
		return odd; 					
	}
	
	public boolean isEven(float number) {
		if(number%2 == 0) {
			return true;  // Es numero par
		}
		return false;	//Es numero impar
	}
	
	public void addNumber(int number) {
		list.add(number);
	}
	
	public int sizeOfList() {					//Method para testear que funcione el add
		return list.size();
	}
	
	public ArrayList<Integer> getList() {
		return list;
	}
	
	public void setList(ArrayList<Integer>listOf) {
		list = listOf;
	}
	
}





