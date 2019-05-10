package com.zkyne.supervenedemo.service.impl;

import com.zkyne.supervenedemo.model.Movie;
import com.zkyne.supervenedemo.repository.MovieRepository;
import com.zkyne.supervenedemo.service.IMovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: MovieServiceImpl
 * @Description:
 * @Author: zkyne
 * @Date: 2019/5/10 18:29
 */
@Service
public class MovieServiceImpl implements IMovieService {
    @Resource
    private MovieRepository movieRepository;

    @Override
    public Movie saveMovie(Movie movie) throws Exception {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> saveMoviePatch(List<Movie> movies) throws Exception {
        return movieRepository.saveAll(movies);
    }
}
