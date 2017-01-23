package io.egen.flix_projectt.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.egen.flix_projectt.entity.MovieInfo;

@Repository
public class MovieInfoRepositoryImpl implements MovieInfoRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<MovieInfo> findAll() {		
		TypedQuery<MovieInfo> query = em.createNamedQuery("MovieInfo.findAll",MovieInfo.class);
		return query.getResultList();
	}

	@Override
	public MovieInfo findOne(String movieId) {
		return em.find(MovieInfo.class,movieId);
	}

	@Override
	public MovieInfo findByName(String name){
		TypedQuery<MovieInfo> query = em.createNamedQuery("MovieInfo.findByName",MovieInfo.class);
		query.setParameter("pName",name);

		List<MovieInfo> movie = query.getResultList();
		if(movie != null && movie.size()==1){
			return movie.get(0);
		}
		
		else{
			return null;
		}
		
	}
	
	@Override
	public MovieInfo create(MovieInfo info) {
		em.persist(info);
		return info;
	}

	@Override
	public MovieInfo update(MovieInfo info) {
		em.merge(info);
		return info;
	}

	@Override
	public void delete(MovieInfo movieId) {
		em.remove(movieId);

	}

	
	}

