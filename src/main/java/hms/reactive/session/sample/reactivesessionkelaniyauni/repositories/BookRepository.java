package hms.reactive.session.sample.reactivesessionkelaniyauni.repositories;

import hms.reactive.session.sample.reactivesessionkelaniyauni.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book,Long> {

    @Query("{ 'name' : { '$regex': '^.*?0.*', '$options': 'si' } }")
    List<Book> findByName(String authorRegex);

}
