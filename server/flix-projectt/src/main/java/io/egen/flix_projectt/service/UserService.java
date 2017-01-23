package io.egen.flix_projectt.service;

import io.egen.flix_projectt.entity.User;

public interface UserService {

	public User create(User user);
	
	public User update(String uId, User user);

   
   public void delete(String uId);
}
