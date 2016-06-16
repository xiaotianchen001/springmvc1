package com.xiaotian.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	private Person person;

	public Person getPerson() {
		return person;
	}
@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}
	

}