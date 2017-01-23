package io.egen.flix_projectt.repository;

import io.egen.flix_projectt.entity.Comment;

public interface CommentRepository {

public Comment create(Comment cmt);

	
	public void delete(Comment cId);

	public Comment findOne(String cId); 

}
