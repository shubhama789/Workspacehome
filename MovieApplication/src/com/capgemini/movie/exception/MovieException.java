package com.capgemini.movie.exception;

public class MovieException extends Exception{
	String excep;
	public MovieException(String msg) {
		excep=msg;
	}
	public String toString() {
		return excep;
	}
}
