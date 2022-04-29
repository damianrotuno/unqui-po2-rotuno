package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	private Person person;
	
	@BeforeEach
	
	public void SetUp() throws Exception{
		
		/*
		 * Se setea una nueva persona con todos sus datos
		 *
		 */
		
		person = new Person("Damian","Rotuno",1991,11,15);
		
		/*person.setName("Damian");
		person.setLastName("Rotuno");
		person.setDateOfBirth(1991,11,15);*/
		person.setAge();
		
	}

	
	@Test
	/*
	 * 
	 * Se testea el calculo de la edad de la persona
	 * 
	 */
	void testAge() {
		int age = person.getAge().getYears();
		
		assertEquals(age,30);
	}
	
	@Test
	
	/*
	 * 
	 * Se testea que persona es menor que la otra
	 * 
	 */
	
	void testLessThan() {
		Person a = new Person("Micaela","Razzetti",1995,8,27);
		
		/*a.setName("Micaela");
		a.setLastName("Razzetti");
		a.setDateOfBirth(1995,8,27);*/
		a.setAge();
		
		assertEquals(person.lessThan(a), false);
		
	}
	
	
	
	

}
