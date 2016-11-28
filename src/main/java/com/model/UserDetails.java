package com.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="uda")
public class UserDetails {
	@Id
	@GeneratedValue
	private int sureshId;
	@Column(name="UN")
	private String userName;
	@Column(name="PWD")
	private String password;
	
	public int getSureshId() {
		return sureshId;
	}
	public void setSureshId(int sureshId) {
		this.sureshId = sureshId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDetails(int sureshId, String userName, String password) {
		super();
		this.sureshId = sureshId;
		this.userName = userName;
		this.password = password;
	}
	public UserDetails() {
		super();
	}
	@Override
	public String toString() {
		return "UserDetails [sureshId=" + sureshId + ", userName=" + userName + ", password=" + password + "]";
	}
	

}
