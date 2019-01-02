package com.capgemini.movie.dao;

public interface IQueryMapper {
public static final String FETCH_MOVIES="SELECT * FROM movie WHERE city=? AND moviename=? AND status='AVAILABLE'";
public static final String BOOK_MOVIE="UPDATE movie SET status=? WHERE movieid=?";
}
