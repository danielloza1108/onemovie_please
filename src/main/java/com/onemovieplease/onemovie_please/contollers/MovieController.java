package com.onemovieplease.onemovie_please.contollers;

import com.onemovieplease.onemovie_please.dao.MovieDao;
import com.onemovieplease.onemovie_please.entity.Movie;
import com.onemovieplease.onemovie_please.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieDao movieDao;

    public MovieController(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @GetMapping("/list")
    public List<Movie> list(){
        List<Movie> movies = movieDao.findAll();
        return movies;
    }

    @PostMapping("/add")
    public void addMovieToHistory(@RequestBody User user, @RequestBody Movie movie){
        movie.setUserId(user.getId());
        movieDao.save(movie);
    }

    @DeleteMapping("/delete")
    public void deleteMovie(@RequestBody Movie movie){
        movieDao.delete(movieDao.findByMovie_id(movie.getMovie_id()));
    }

}
