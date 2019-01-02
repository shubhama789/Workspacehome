package com.capgemini.movie.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.capgemini.movie.bean.MovieBean;
import com.capgemini.movie.dao.IMovieDAO;
import com.capgemini.movie.dao.MovieDAOImpl;
import com.capgemini.movie.exception.MovieException;

public class MovieImpl implements IMovieInterface{

	@Override
	public ArrayList<MovieBean> fetchMovies(String city, String movie) throws SQLException, MovieException {
		IMovieDAO im=new MovieDAOImpl();
		return im.fetchMovies(city,movie);
	}

	@Override
	public boolean bookMovie(int movieId) throws SQLException, MovieException {
		IMovieDAO im=new MovieDAOImpl();
		return im.bookMovie(movieId);
		
	}

}
