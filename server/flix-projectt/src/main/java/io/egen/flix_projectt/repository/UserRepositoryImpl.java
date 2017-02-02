package io.egen.flix_projectt.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import io.egen.flix_projectt.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public User create(User user) {
		em.persist(user);
		return user;
	}
	
	@Override
	public User findOne(String uId) {
		return em.find(User.class,uId);
	}

	
	@Override
	public User update( User user) {
		return em.merge(user);
	}

	@Override
	public void delete(String uId) {
		em.remove(uId);
		
	}

}
