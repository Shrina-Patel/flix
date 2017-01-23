package io.egen.flix_projectt.service;

import io.egen.flix_projectt.entity.Comment;

   public interface CommentService {
	
   public Comment create(Comment cmt);
		
	public void delete(String cId);


}
