package com.zkyne.supervenedemo.repository;

import com.zkyne.supervenedemo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: MovieRepository
 * @Description:
 * @Author: zkyne
 * @Date: 2019/5/10 18:27
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

}
