package com.texoit.awards.controller;

import com.texoit.awards.entity.Movie;
import com.texoit.awards.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public Iterable<Movie> findAll() {
        return movieService.findAll();
    }

}
