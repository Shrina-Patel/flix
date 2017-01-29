package io.egen.flix_projectt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.flix_projectt.entity.MovieInfo;
import io.egen.flix_projectt.services.MovieInfoService;

@RestController
@RequestMapping(value="movieInfo")
public class MovieInfoController {
	
	
	@Autowired
	private MovieInfoService movieService;
	
	@RequestMapping(method=RequestMethod.GET)
	public	List<MovieInfo> findAll(){
			return movieService.findAll();
		
	}

	@RequestMapping(method=RequestMethod.GET,value="{id}")
	public MovieInfo findOne(@PathVariable("imdbID") String movieId){
		return movieService.findOne(movieId);
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public MovieInfo create(@RequestBody MovieInfo info){
		return movieService.create(info);
		
	}

	@RequestMapping(method=RequestMethod.PUT,value="{id}")
	public MovieInfo update(@PathVariable("id") String movieId, @RequestBody MovieInfo info){
		return movieService.update(movieId,info);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="{id}")
	public void delete(@PathVariable("id") String movieId){
		movieService.delete(movieId);
	}
}

