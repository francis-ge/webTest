package com.employees;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

public class EmployeesAction implements RequestAware{
	private Dao dao = new Dao();
	private Map<String,Object> request;
	private Integer employeeId;
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}	

	
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
	
	public String list(){
		request.put("emps", dao.getEmployees());
		return "list";
	}

	public String delete(){
		dao.delete(employeeId);
		return "delete";
	}

}
