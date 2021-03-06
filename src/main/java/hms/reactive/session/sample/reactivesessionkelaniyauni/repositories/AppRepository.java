package hms.reactive.session.sample.reactivesessionkelaniyauni.repositories;

import hms.reactive.session.sample.reactivesessionkelaniyauni.models.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AppRepository extends MongoRepository<Movie, Long> {

    @Query("{ 'name' : { '$regex': '^.*?0.*', '$options': 'si' } }")
    List<Movie> findByName(String authorRegex);

}
