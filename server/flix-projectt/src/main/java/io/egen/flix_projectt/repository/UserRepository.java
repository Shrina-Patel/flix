package io.egen.flix_projectt.repository;

import io.egen.flix_projectt.entity.User;

public interface UserRepository {
		
		   public User create(User user);
			
			public User update( User user);

			public User findOne(String uId);

		   
		   public void delete(String uId);


}
