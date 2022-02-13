package TestNGspicejet.src.salesforceproject;

public class User {
String firstName=null;
String LastName=null;
String jobTitle=null;
String Email=null;
String Company=null;
String phone=null;
String Country=null;
String Employees=null;
User(String first,String Last,String Job,String Email,String Phone,String company,String Country,String Emp)
{
	this.firstName=first;
	this.LastName=Last;
	this.jobTitle=Job;
	this.Email=Email;
	this.phone=Phone;
	this.Country=Country;
	this.Company=company;
	this.Employees=Emp;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public String getEmployees() {
	return Employees;
}
public void setEmployees(String employees) {
	this.Employees = employees;
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getjobTitle() {
	return jobTitle;
}
public void setjobTitle(String title) {
	jobTitle = title;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getCompany() {
	return Company;
}
public void setCompany(String company) {
	Company = company;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

}
