package com.texoit.awards.repository;

import com.texoit.awards.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
