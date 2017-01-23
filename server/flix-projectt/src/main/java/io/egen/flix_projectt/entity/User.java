package io.egen.flix_projectt.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	 
	@NamedQuery(name="User.findByEmail",query="SELECT u FROM User u WHERE u.email=:pEmail")
})
public class User {
	
	@Id
	private String uId;
	private String Name;
	
	@Column(unique = true)
	private String email;
	private String password;
	
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
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
	

}
