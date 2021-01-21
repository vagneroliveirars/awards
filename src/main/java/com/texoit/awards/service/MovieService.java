package com.texoit.awards.service;

import com.texoit.awards.entity.Movie;
import com.texoit.awards.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Iterable<Movie> findAll() {
        return movieRepository.findAll();
    }

}
