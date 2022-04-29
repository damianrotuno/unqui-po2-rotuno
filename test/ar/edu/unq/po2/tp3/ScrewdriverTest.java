package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScrewdriverTest{
	
	private Screwdriver screwdriver;

	@BeforeEach

	public void setUp() throws Exception{
	
	//Se crea el desarmador de numeros
	
	screwdriver = new Screwdriver();
	
	
	//Se agregan los numeros a la lista
	
	screwdriver.addNumber(2522);
	screwdriver.addNumber(123);
	screwdriver.addNumber(6644);
	screwdriver.addNumber(9999);
	
	}
	
	@Test
	
	public void testMoreEvenNumbers() {
		
		int n = screwdriver.moreEvenNumbers();

		assertEquals(n,6644);
	}
	
	
}