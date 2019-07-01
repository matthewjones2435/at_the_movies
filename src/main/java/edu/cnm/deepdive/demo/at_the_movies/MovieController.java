package edu.cnm.deepdive.demo.at_the_movies;

import edu.cnm.deepdive.demo.at_the_movies.model.entity.Movie;
import edu.cnm.deepdive.demo.at_the_movies.model.entity.Movie.Genre;
import edu.cnm.deepdive.demo.at_the_movies.model.dao.MovieRepository;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("movies")
public class MovieController {

  private MovieRepository repository;

  public MovieController(
      MovieRepository repository) {
    this.repository = repository;
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  List<Movie> lsit(@RequestParam(value = "genre", required = false) Genre genre) {
    if (genre == null ) {
      return repository.getAllByOrderByTitleAsc();
    } else {
      return repository.getAllByGenreOrderByTitleAsc(genre);
    }
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  Movie post(@RequestBody Movie movie) {

    return repository.save(movie); // TODO build a ResponseEntity.
  }

}
