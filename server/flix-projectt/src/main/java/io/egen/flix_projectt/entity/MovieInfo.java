package io.egen.flix_projectt.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({
	@NamedQuery(name="MovieInfo.findAll",query="SELECT m FROM MovieInfo m"), 
	@NamedQuery(name="MovieInfo.findByName",query="SELECT m FROM MovieInfo m WHERE m.movieName=:pName"),
	@NamedQuery(name = "Movie.filterByGenre", query = "SELECT m FROM MovieInfo m WHERE m.genre LIKE :pGenre"),
	@NamedQuery(name = "Movie.filterByImdbRating", query = "SELECT m FROM MovieInfo m WHERE m.movieRate BETWEEN :pRatingGT and :pRatingLT"),
	@NamedQuery(name = "Movie.filterByVotes", query = "SELECT m FROM Movie m WHERE m.imdbVotes BETWEEN :pVotesGT and :pVotesLT")

})

public class MovieInfo {

	@Id
	private String imdbID;
	@Column(unique = true)
	private String movieName;
	private String movieDirector;
	private String movieWriter;
	private String moiveRate;
	private String releaseYear;
	private String releaseDate;
	private String Genre;
	private String language;

	
	public String getGenre() {
		return Genre;
	}


	public void setGenre(String genre) {
		Genre = genre;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}

	
	
	public String getReleaseYear() {
		return releaseYear;
	}


	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}


	public MovieInfo(){
		this.imdbID = UUID.randomUUID().toString(); //it will generate random number in database
	}
	
	
	public String getImdbID() {
		return imdbID;
	}


	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}


	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getMovieWriter() {
		return movieWriter;
	}
	public void setMovieWriter(String movieWriter) {
		this.movieWriter = movieWriter;
	}
	public String getMoiveRate() {
		return moiveRate;
	}
	public void setMoiveRate(String moiveRate) {
		this.moiveRate = moiveRate;
	}


	@Override
	public String toString() {
		return "MovieInfo [imdbID=" + imdbID + ", movieName=" + movieName + ", movieDirector=" + movieDirector
				+ ", movieWriter=" + movieWriter + ", moiveRate=" + moiveRate + ", releaseYear=" + releaseYear
				+ ", releaseDate=" + releaseDate + ", Genre=" + Genre + ", language=" + language + "]";
	}
	


	
	
	
	
}

