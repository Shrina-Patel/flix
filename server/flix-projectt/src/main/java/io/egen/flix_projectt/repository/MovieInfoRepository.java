package io.egen.flix_projectt.repository;

import java.util.List;

import io.egen.flix_projectt.entity.MovieInfo;

public interface MovieInfoRepository {
	
	public	List<MovieInfo> findAll();
	
	public MovieInfo findOne(String movieId);
	
	public MovieInfo create(MovieInfo info);
	
	public MovieInfo update(  MovieInfo info);
	
	public void delete( MovieInfo movieId);
	
	public MovieInfo findByName(String name);

}

