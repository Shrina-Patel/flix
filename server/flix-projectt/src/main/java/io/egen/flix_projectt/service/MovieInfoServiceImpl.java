package io.egen.flix_projectt.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import io.egen.flix_projectt.entity.MovieInfo;
import io.egen.flix_projectt.exception.BadRequestException;
import io.egen.flix_projectt.repository.MovieInfoRepository;

@Service
@EnableTransactionManagement
public class MovieInfoServiceImpl implements MovieInfoService {

@Autowired
	
	private MovieInfoRepository repository;

	
	@Override
	@Transactional(readOnly=true)
	public List<MovieInfo> findAll() {

		return repository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public MovieInfo findOne(String movieId) {
		MovieInfo info = repository.findOne(movieId);
		if(info==null){
			throw new EntityNotFoundException("Movie not foud");
		}
		return info;
	}

	@Override
	@Transactional
	public MovieInfo create(MovieInfo info) {
		MovieInfo existing = repository.findOne(info.getImdbID());
		if(existing!=null){
			throw new BadRequestException("Movie already exist");
		}
		return repository.create(info);
	}

	@Override
	@Transactional
	public MovieInfo update(String movieId, MovieInfo info) {
		MovieInfo existing = repository.findOne(movieId);
		if(existing==null){
			throw new EntityNotFoundException("Movie not found");
		}
		return repository.update(info);
	}

	@Override
	@Transactional
	public void delete(String movieId) {
		
		MovieInfo info = repository.findOne(movieId);
		if(info==null){
			throw new EntityNotFoundException("Movie not found");
		}
		
		repository.delete(info);
		
	}



	

}
