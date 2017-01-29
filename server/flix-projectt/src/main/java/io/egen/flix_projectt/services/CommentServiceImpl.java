package io.egen.flix_projectt.services;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import io.egen.flix_projectt.entity.Comment;
import io.egen.flix_projectt.repository.CommentRepository;

@Service
@EnableTransactionManagement
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository repository;
	
	@Override
	@Transactional
	public Comment create(Comment cmt) {
		return repository.create(cmt);
	}

	@Override
	@Transactional
	public void delete(String cId) {
		Comment cmt = repository.findOne(cId);
		if(cmt==null){
			throw new EntityNotFoundException("Comment not found");
			
		}
		repository.delete(cmt);
		
	}

}
