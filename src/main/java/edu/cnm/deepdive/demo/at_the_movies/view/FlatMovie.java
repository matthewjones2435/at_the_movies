package edu.cnm.deepdive.demo.at_the_movies.view;

import edu.cnm.deepdive.demo.at_the_movies.model.entity.Movie;
import edu.cnm.deepdive.demo.at_the_movies.model.entity.Movie.Genre;
import java.net.URI;
import java.util.Date;
import java.util.UUID;

public interface FlatMovie {

  UUID getId();

  Date getCreated();

  Date getUpdated();

  String getTitle();

  String getScreenwriter();

  Genre getGenre();

  URI getHref();

}
