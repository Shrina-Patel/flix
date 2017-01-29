package io.egen.flix_projectt.services;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import io.egen.flix_projectt.entity.User;
import io.egen.flix_projectt.repository.UserRepository;


@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;
	

	@Override
	@Transactional
	public User create(User user) {
		return repository.create(user);
	}

	@Override
	@Transactional
	public User update(String uId,User user) {
		User userInfo = repository.findOne(uId);
		if(userInfo==null){
			throw new EntityNotFoundException("User not found");
		}
		return repository.update(user);
	}

	@Override
	@Transactional
	public void delete(String uId) {
		User userInfo = repository.findOne(uId);
		if(userInfo==null){
			throw new EntityNotFoundException("User not found");
		}
	 repository.update(userInfo);
		

	}

}

