package edu.cnm.deepdive.demo.at_the_movies.model.dao;

import edu.cnm.deepdive.demo.at_the_movies.model.entity.Actor;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("actors")
@ExposesResourceFor(Actor.class)

public interface ActorRepository extends CrudRepository<Actor, UUID> {

  List<Actor> getAllByOrderByName();

  List<Actor>getAllByNameContainsOrderByNameAsc(String nameFragment);
}
