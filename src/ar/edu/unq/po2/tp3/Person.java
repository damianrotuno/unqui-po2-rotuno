package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class Person {
	
	private String name;
	private String lastName;
	private LocalDate dateOfBirth;
	private Period age;
	
	public Person(String name, String lastName, int age, int month, int day) {
		this.setName(name);
		this.setLastName(lastName);
		this.setDateOfBirth(age,month,day);
		
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLastName(String n){
		name = n;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setDateOfBirth(int day, int m, int age) {
		dateOfBirth = LocalDate.of(day, m, age);
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setAge(){
		age = Period.between(dateOfBirth, LocalDate.now());
	}
	
	public Period getAge() {
		return age;
	}
	
	public boolean lessThan(Person p) {
		if(this.getAge().getYears() < p.getAge().getYears()) {
			return true;
		}
			return false;
	}
	
	
}
