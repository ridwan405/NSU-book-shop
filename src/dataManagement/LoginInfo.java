package dataManagement;

import java.io.Serializable;

public class LoginInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private   String userName;
	private  String passWord;
	
	public LoginInfo(String userName, String passWord) {
		this.userName= userName;
		this.passWord= passWord;
	}

	public  String getUserName() {
		return userName;
	}

	public  void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public  void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public boolean isNotSet() {
		if(userName.equals(null))
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "user: "+userName+"\n pass: "+passWord;
	}

}
