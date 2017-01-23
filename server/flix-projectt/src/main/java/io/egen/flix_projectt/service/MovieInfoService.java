package io.egen.flix_projectt.service;

import java.util.List;


import io.egen.flix_projectt.entity.MovieInfo;

public interface MovieInfoService {

	public	List<MovieInfo> findAll();
	
	public MovieInfo findOne(String movieId);
		
	public MovieInfo create(MovieInfo info);
	
	public MovieInfo update( String movieId,MovieInfo info);
	
	public void delete( String movieId);
}
