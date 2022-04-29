package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {
	
	String a = "abc";
	String s = a;
	String t;
	
	@Test
	
	/*
	 * Testea la longitud del String s, que a su vez apunta al String a
	 * 
	 */
	void test1(){
		int n = s.length();
		
		assertEquals(n,3);

	}
	
	/*
	 * 
	 * 
	 * Testea la longitud del String t
	 */
	
	@Test
	void test2(){
		int n = t.length();
		
		assertEquals(n,null);

	}
	
	/*
	 * 
	 * Suma entre un int y un String
	 *
	 */
	
	@Test
	void test3(){
		String n = 1 + a;
		
		assertEquals(n,"1abc");

	}
	
	/*
	 * 
	 * Pasa a Mayusculas todo el String a
	 * 
	 */
	
	@Test
	void test4(){
		String n = a.toUpperCase();
		
		assertEquals(n,"ABC");

	}
	
	/*
	 * 
	 * Devuelve la posicion en que se encuentra r
	 * 
	 */
	
	@Test
	void test5(){
		int n = "Libertad".indexOf("r");
		
		assertEquals(n,4);

	}
	
	/*
	 * 
	 * Devuelve la posicion de la ultima i en la palabra Universidad
	 * 
	 */
	
	@Test
	void test6(){
		int n = "Universidad".lastIndexOf("i");
		
		assertEquals(n,7);

	}
	
	/*
	 * 
	 * 
	 * Devuelve los caracteres de la palabra Quilmes entre las posiciones 2 y 4
	 * 
	 */
	
	@Test
	void test7(){
		String n = "Quilmes".substring(2,4);		
		assertEquals(n,"il");

	}
	
	/*
	 *
	 * Devuelve verdadero si la cadena n comienza con a
	 *
	 */
	
	@Test
	void test8(){
		boolean n = (a.length() + a).startsWith("a");	
		assertEquals(n,false);

	}
	
	/*
	 * 
	 * Devuelve verdadero si s es igual a a
	 * 
	 */
	
	@Test
	void test9(){
		boolean n = s == a;	
		assertEquals(n,true);

	}
	
	/*
	 * 
	 * Devuelve verdadero si los caracteres entre las posiciones 1 y 3 son igual a bc
	 * 
	 */
	
	@Test
	void test10(){
		boolean n = a.substring(1,3).equals("bc");
		assertEquals(n,true);

	}

	
	

}
