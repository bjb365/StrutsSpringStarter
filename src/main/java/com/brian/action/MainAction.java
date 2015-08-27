package com.brian.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class MainAction extends ActionSupport implements Preparable  {

	private static final long serialVersionUID = 1L;
	private String x;
	
	
	
	public String getX() {
		return x;
	}

	public MainAction(String x) {
		super();
		this.x = x;
	}

	public void prepare() throws Exception {
		System.out.println(">>" + getClass().getName());
		System.out.println(this.x);
	}
	
	public String hello(){
		System.out.println(">>" + getClass().getName());
		return Action.SUCCESS;
	}

}
