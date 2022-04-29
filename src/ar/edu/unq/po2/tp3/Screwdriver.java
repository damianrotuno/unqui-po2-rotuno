package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Screwdriver {
	
	private ArrayList<Integer> listNumbers = new ArrayList<Integer>(); // Lista de numeros 
	private ArrayList<Integer> number = new ArrayList<Integer>(); //Lista de un numero separado en digitos
	public Counter counter = new Counter();
	
	public void number(int n) {			//Se separa al numero en digitos
		while(n > 0) {
			number.add(n%10);
			n = n / 10;
		}

	}

	public void addNumber(int number) {
		listNumbers.add(number);
	}
	
	public void numberToList() { 		//Se pasa la lista de numeros a la lista del contador
		counter.setList(number);
	}
	
	public int cantToEvenNumbers(int n) {   // Se cuenta la cantidad de numeros pares
		this.number(n);
		this.numberToList();
		return this.counter.even();
		
	}
	
	public int moreEvenNumbers() {			//Se recorre la lista comparando quien es 
		int bigger = 0;						//el numero con mayor cantidad de numeros pares

		for(int n:listNumbers) {
			if(this.isBiggerThat(n, bigger)) {
				bigger = n;
			}
		}
		return bigger;
	}

	public boolean isBiggerThat(int a, int b) {
		a = this.cantToEvenNumbers(a);
		number.clear();
		b = this.cantToEvenNumbers(b);
		number.clear();
		
		if(a > b) {
			return true;
		}
		return false;
	}

}
