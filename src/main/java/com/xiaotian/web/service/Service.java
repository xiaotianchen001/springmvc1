package com.xiaotian.web.service;

import java.util.ArrayList;
import java.util.List;

import com.xiaotian.web.model.User;

public class Service {

	ArrayList<User> list;


	public void add(User user)
	{
		list.add(user);
	}


	public ArrayList<User> getList() {
		return list;
	}


	public void setList(ArrayList<User> list) {
		this.list = list;
	}
}
