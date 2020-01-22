package com.example.moviecatalogservice.controller;


import com.example.moviecatalogservice.modal.CatalogItem;
import com.example.moviecatalogservice.modal.Movie;
import com.example.moviecatalogservice.modal.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
    @Autowired
        RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable int userId){

        List<Rating> ratings= Arrays.asList(new Rating(1234,2),new Rating(2345,5));
        return ratings.stream().map(rating -> {
           //Movie movie= restTemplate.getForObject("http://localhost:8081/movies/"+rating.getRating(), Movie.class);
            Movie movie=webClientBuilder.build()
                            .get()
                            .uri("http://localhost:8081/movies/"+rating.getRating())
                            .retrieve()
                            .bodyToMono(Movie.class)
                        .block();
           return new CatalogItem(rating.getRating(),"desc",movie.getName());
        }).collect(Collectors.toList());

    }
}
