package edu.cnm.deepdive.demo.at_the_movies.model.dao;

import edu.cnm.deepdive.demo.at_the_movies.model.entity.Actor;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, UUID> {


  // TODO Declare any required query methods

  List<Actor> getAllByName();

}
