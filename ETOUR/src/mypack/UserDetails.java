package mypack;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Required;



@Entity
public class UserDetails {


	private int User_id;
	private String User_Name;
	private String Password;
	private String Email;
	
	public UserDetails() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	
	@Required
	@Column(name="User_Name" , nullable = false,length=20)
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	
	
	@Required
	@Column(name="Password",nullable=false,length=20)
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	@Required
	@Column(name="Email",nullable=false,unique = true)
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	
	
	
	
	
	
	
}
