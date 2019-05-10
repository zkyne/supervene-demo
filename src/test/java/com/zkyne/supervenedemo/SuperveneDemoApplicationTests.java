package com.zkyne.supervenedemo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zkyne.supervenedemo.model.Movie;
import com.zkyne.supervenedemo.service.IMovieService;
import com.zkyne.supervenedemo.utils.HttpsUtils;
import org.jsoup.Connection.Response;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SuperveneDemoApplicationTests {
    @Resource
    private IMovieService movieService;

//    @Test
    public void contextLoads() throws Exception {
        Response response = HttpsUtils.get("https://movie.douban.com/j/search_subjects?type=movie&tag=%E7%83%AD%E9%97%A8&page_limit=350&page_start=0");
        String body = response.body();
        JSONObject jsonObject = JSON.parseObject(body);
        String subjects = jsonObject.get("subjects").toString();
        List<Movie> movies = JSONArray.parseArray(subjects, Movie.class);
        movieService.saveMoviePatch(movies);
    }

}
