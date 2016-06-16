package com.xiaotian.web.service;

import java.util.ArrayList;

import com.xiaotian.web.model.User;

public class ServiceImp implements ServiceIn {

	ArrayList<User>list;
	@Override
	public ArrayList<User> getList() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public void setList(ArrayList<User> list) {
		this.list=list;

	}

	
	
}
