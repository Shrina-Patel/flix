package io.egen.flix_projectt.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import io.egen.flix_projectt.entity.Comment;

@Repository
public class CommentRepositoryImpl implements CommentRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Comment create(Comment cmt) {
		em.persist(cmt);
		return cmt;
	}


	@Override
	public void delete(Comment cId) {
		em.remove(cId);
	}

	@Override
	public Comment findOne(String cId) {		
		return em.find(Comment.class,cId);
	}

}
