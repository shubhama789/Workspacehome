package com.capgemini.movie.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.capgemini.movie.bean.MovieBean;
import com.capgemini.movie.exception.MovieException;

public interface IMovieDAO {
	public ArrayList<MovieBean> fetchMovies(String city, String movie) throws SQLException, MovieException;
	public boolean bookMovie(int movieId) throws SQLException, MovieException;
}
