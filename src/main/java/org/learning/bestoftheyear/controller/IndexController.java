package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.model.Movies;
import org.learning.bestoftheyear.model.Songs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping("/")
    public String homepage(Model model) {
        String myName = "Yassine";
        model.addAttribute("name", myName);

        return "homepage";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        List<Movies> bestMovies = getBestMovies();

        model.addAttribute("bestmovies", bestMovies);

        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {

        List<Songs> bestSongs = getBestSongs();

        model.addAttribute("bestsongs", bestSongs);

        return "songs";
    }

    private List<Movies> getBestMovies() {
        List<Movies> bestMovies = new ArrayList<>();
        bestMovies.add(new Movies(1, "barbie"));
        bestMovies.add(new Movies(2, "jaws"));
        bestMovies.add(new Movies(3, "tenet"));
        bestMovies.add(new Movies(4, "avengers"));
        bestMovies.add(new Movies(5, "batman"));

        return bestMovies;
    }

    private List<Songs> getBestSongs() {
        List<Songs> bestSongs = new ArrayList<>();
        bestSongs.add(new Songs(1, "rude"));
        bestSongs.add(new Songs(2, "hey jude"));
        bestSongs.add(new Songs(3, "rap"));
        bestSongs.add(new Songs(4, "pop"));
        bestSongs.add(new Songs(5, "rock"));


        return bestSongs;
    }
}
