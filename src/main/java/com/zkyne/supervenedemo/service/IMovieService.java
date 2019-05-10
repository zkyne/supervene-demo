package com.zkyne.supervenedemo.service;

import com.zkyne.supervenedemo.model.Movie;

import java.util.List;

/**
 * @ClassName: IMovieService
 * @Description:
 * @Author: zkyne
 * @Date: 2019/5/10 18:28
 */
public interface IMovieService {

    Movie saveMovie(Movie movie) throws Exception;

    List<Movie> saveMoviePatch(List<Movie> movies) throws Exception;

}
