package com.webTest;

import org.apache.commons.lang3.SystemUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String username;
	private String password;
	private String Login;
	
	public LoginAction(){
		//System.out.println("ActionCreate");
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String execute() throws Exception{
		ActionContext ac = ActionContext.getContext();
		
		//return SUCCESS;
		if (getUsername().equals("user") && getPassword().equals("password")){
			
			ActionContext.getContext().getSession().put("user", getUsername());
			
			return SUCCESS;
		}
		else{
			return ERROR;
		}
			
	}
	
	public String logout() throws Exception{
		return "logout";
	}
}
