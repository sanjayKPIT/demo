package com.kpit.demo.VM;

import com.kpit.demo.model.Address;
import com.kpit.demo.model.Company;
import com.kpit.demo.model.Employee;

public class EmployeeVM {
	
private int id;

private String name;

private  String firstName;

private String login;

private Address homeAddress;

private String contact;

private String url;

private Company company;

public EmployeeVM() {
	super();
}

public EmployeeVM(Employee emp) {
	super();
	this.id = emp.getId();
	this.name = emp.getName();
	this.firstName = emp.getUsername();
	this.login = emp.getEmail();
	this.homeAddress = emp.getAddress();
	this.contact = emp.getPhone();
	this.url = emp.getWebsite();
	this.company = emp.getCompany();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public Address getHomeAddress() {
	return homeAddress;
}

public void setHomeAddress(Address homeAddress) {
	this.homeAddress = homeAddress;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public Company getCompany() {
	return company;
}

public void setCompany(Company company) {
	this.company = company;
}


}
