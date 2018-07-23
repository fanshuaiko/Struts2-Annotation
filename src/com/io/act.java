package com.io;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.User.User;
import com.opensymphony.xwork2.ActionSupport;
//@ParentPackage("struts-default")
//@Namespace("/rj")
//@ExceptionMappings({@ExceptionMapping(exception="java.lange.RunTimeException",result="error")})

import ognl.OgnlContext;
public class act extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Action(value="act",results= {@Result(name="success" ,location="/success.jsp"),@Result(name = "fail",location="/fail.jsp")})
	public String login() throws Exception{
		System.out.println("123456789");
		if(user.getUsername().equals("123")) {
			
			return SUCCESS;
		}else {
			return "fail";
		}
	}
	
	
}
