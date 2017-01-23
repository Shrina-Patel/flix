package io.egen.flix_projectt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.flix_projectt.entity.Comment;
import io.egen.flix_projectt.service.CommentService;


@RestController
@RequestMapping(value="comment")
public class CommentController {
	
@Autowired
private CommentService service;

//	@RequestMapping(method=RequestMethod.GET,value="{id}")
//	public MovieInfo findOne(@PathVariable("imdbID") String movieId){
//		return findOne(movieId);
//		
//	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Comment create(@RequestBody Comment cmt){
		return service.create(cmt);
		
	}

	
	
	@RequestMapping(method=RequestMethod.DELETE,value="{id}")
	public void delete(@PathVariable("id") String cId){
		service.delete(cId);
	}

}
