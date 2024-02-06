package bookManagement;

import java.io.Serializable;

public class Author implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name, gender, emailId;
	int age;
	
	public Author(String name, String emailId, int age, String gender){
		this.age= age;
		this.emailId= emailId;
		this.name= name;
		this.gender= gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Name: "+name+"("+gender+"), "+age+" at "+emailId;
	}
}
