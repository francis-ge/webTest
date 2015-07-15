package com.employees;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dao {
	private static Map<Integer,Employee> emps = new HashMap<Integer,Employee>();
	
	static{
		emps.put(1001, new Employee(1001,"AA","aa","aa@123.com"));
		emps.put(1002, new Employee(1002,"BB","bb","bb@123.com"));
		emps.put(1003, new Employee(1003,"CC","cc","cc@123.com"));
		emps.put(1004, new Employee(1004,"DD","dd","dd@123.com"));
		emps.put(1005, new Employee(1005,"EE","ee","ee@123.com"));
	}
	
	public List<Employee> getEmployees(){
		return new ArrayList<>(emps.values());
	}
	
	public void delete(Integer Id){
		emps.remove(Id);
	}
	public void add(Employee emp){
		long time = System.currentTimeMillis();
		emp.setId((int)time);
		
		emps.put(emp.getId(), emp);
	}
	
	public Employee get(Integer Id){
		return emps.get(Id);
		
	}
	
	public void update(Employee emp){
		emps.put(emp.getId(), emp);
	}
}
