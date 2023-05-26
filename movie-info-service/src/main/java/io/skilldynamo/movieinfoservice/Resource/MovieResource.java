package io.skilldynamo.movieinfoservice.Resource;

import io.skilldynamo.movieinfoservice.Model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId")String movieId){
        return new Movie(movieId,"THE PRISONER");

    }
}
