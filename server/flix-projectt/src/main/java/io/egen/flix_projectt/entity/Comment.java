package io.egen.flix_projectt.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.egen.flix_project.entity.MovieInfo;
import io.egen.flix_project.entity.User;

@Entity
public class Comment {
	
	@Id
	private String Comment_Id;
	private String msg;
	
	@ManyToOne
	private User uId;
	
	@ManyToOne
	private MovieInfo imdbId;
	
	
	public Comment(){
		this.Comment_Id = UUID.randomUUID().toString(); //it will generate random number in database
	}
	
	public String getComment_Id() {
		return Comment_Id;
	}
	public void setComment_Id(String comment_Id) {
		Comment_Id = comment_Id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public User getuId() {
		return uId;
	}
	public void setuId(User uId) {
		this.uId = uId;
	}
	public MovieInfo getImdbId() {
		return imdbId;
	}
	public void setImdbId(MovieInfo imdbId) {
		this.imdbId = imdbId;
	}
	

}
