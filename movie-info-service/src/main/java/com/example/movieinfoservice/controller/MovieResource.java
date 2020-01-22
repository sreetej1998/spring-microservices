package com.example.movieinfoservice.controller;


import com.example.movieinfoservice.modal.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/movies")
public class MovieResource {
    @GetMapping("/{movieId}")
    public Movie getMovie(@PathVariable int movieId){
        return new Movie(movieId,"transformers");
    }
}
