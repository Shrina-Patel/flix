package io.egen.flix_projectt.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u ORDER BY u.email ASC"),
	@NamedQuery(name="User.findByEmail",query="SELECT u FROM User u WHERE u.email=:pEmail")
})

public class User {
	
	
	@Id
	private String uId;
	private String name;
	
	@Column(unique = true)
	private String email;
	private String password;
	private String role;
	
	public  User(){
		
		this.uId = UUID.randomUUID().toString(); //it will generate random number in database
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String id) {
		this.uId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		name = Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "User [uId=" + uId + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
				+ "]";
	}
}
