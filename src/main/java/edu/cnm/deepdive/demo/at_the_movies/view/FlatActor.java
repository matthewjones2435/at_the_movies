package edu.cnm.deepdive.demo.at_the_movies.view;

import edu.cnm.deepdive.demo.at_the_movies.model.entity.Actor;
import java.net.URI;
import java.util.Date;
import java.util.UUID;

public interface FlatActor {

   UUID getId();

   Date getCreated();

   Date getUpdated();

   String getName();

   URI getHref();

}
