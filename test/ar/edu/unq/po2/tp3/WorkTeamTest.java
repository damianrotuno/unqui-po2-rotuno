package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WorkTeamTest {
	
	private WorkTeam workTeam; 
	
	
	@BeforeEach
	
	public void SetUp() throws Exception{
		
		workTeam = new WorkTeam(); //Se setea un nuevo equipo de trabajo
		
		/*
		 * Se crean las personas que van a integrar el equipo de trabajo 
		 */
		
		Person d = new Person("Damian","Rotuno",1991,11,15);
		Person m = new Person("Micaela","Razzetti",1995,8,27);
		Person l = new Person("Lucas","Rotuno",1997,4,10);
		Person a = new Person("Agostina","Rotuno",2002,12,3);
		Person f = new Person("Facundo","Razzetti",1997,4,12);
		
		/*
		 * Se setean las edades de las personas
		 */
		
		d.setAge();
		m.setAge();
		l.setAge();
		a.setAge();
		f.setAge();
		
		/*
		 * Se agregan las personas al equipo de trabajo
		 */
		
		workTeam.addMember(d);
		workTeam.addMember(m);
		workTeam.addMember(l);
		workTeam.addMember(a);
		workTeam.addMember(f);

	}
	
	@Test
	
	/*
	 * Se testea el tamaño del equipo
	 */
	void testSizeOfTeam() {
		int a = workTeam.sizeOfTeam();
		
		assertEquals(a,5);
	}
	
	@Test
	
	/*
	 * Se testea el promedio de edad del equipo
	 */
	
	void testAverage(){
		float a = workTeam.averageAgeMembers();
		
		assertEquals(a,24.6);
		System.out.println("El promedio de edad es:" + a);
	}

}
