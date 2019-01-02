package com.capgemini.movie.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.capgemini.movie.exception.MovieException;
import com.capgemini.movie.bean.*;
public interface IMovieInterface {
	public ArrayList<MovieBean> fetchMovies(String city,String movie) throws SQLException,MovieException;
	public boolean bookMovie(int movieId) throws SQLException,MovieException;
}
