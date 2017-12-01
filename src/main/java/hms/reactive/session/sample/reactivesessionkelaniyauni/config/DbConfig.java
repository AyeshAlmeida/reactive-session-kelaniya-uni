package hms.reactive.session.sample.reactivesessionkelaniyauni.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "hms.reactive.session.sample")
public class DbConfig extends AbstractMongoConfiguration {


    @Override
    protected String getDatabaseName() {
        return "test-db";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("localhost");
    }
}
