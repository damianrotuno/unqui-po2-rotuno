package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class WorkTeam {
	
	private String name;
	private ArrayList<Person> members = new ArrayList();
	
	
	public void addMember(Person p) {
		members.add(p);
	}
	
	public String getName() {
		return name;
	}
	
	public float averageAgeMembers() {
		float av = 0;
		
		for(Person member:members) {
			float y = member.getAge().getYears();
			av += y;
		}
		
		av = av / members.size();
		
		return av;
	}
	
	public int sizeOfTeam() {
		return members.size();
	}

}
