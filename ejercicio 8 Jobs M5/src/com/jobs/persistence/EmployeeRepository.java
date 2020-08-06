package com.jobs.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;

//In this class we store and add members to our list of workers
public class EmployeeRepository {

	//This class only stores a List of AbStaffMember child classes in the static variable "members"
	private static List<AbsStaffMember> members=new ArrayList<>();
	
	//It has the default constructor
	public EmployeeRepository(){
		
	}
	
	//And has a getter that shows all members we made
	public List<AbsStaffMember> getAllMembers(){
		return (members);
	}
	
	
	//It has a method to add members
	public void addMember(AbsStaffMember member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}
	
	
}
