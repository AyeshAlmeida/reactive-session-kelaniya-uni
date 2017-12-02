package hms.reactive.session.sample.reactivesessionkelaniyauni.initializers;


import hms.reactive.session.sample.reactivesessionkelaniyauni.repositories.AppRepository;
import hms.reactive.session.sample.reactivesessionkelaniyauni.repositories.BookRepository;
import hms.reactive.session.sample.reactivesessionkelaniyauni.service.MockService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Order(2)
@Component
public class DbInitializer implements ApplicationRunner {
    @Resource
    AppRepository appRepository;
    @Resource
    BookRepository bookRepository;

    @Resource
    MockService mockService;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        mockService.getApplications(100).forEach(appRepository::save);
        mockService.getBooks(100).forEach(bookRepository::save);
    }
}
