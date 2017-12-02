package hms.reactive.session.sample.reactivesessionkelaniyauni.controllers;

import hms.reactive.session.sample.reactivesessionkelaniyauni.models.Movie;
import hms.reactive.session.sample.reactivesessionkelaniyauni.models.Book;
import hms.reactive.session.sample.reactivesessionkelaniyauni.repositories.AppRepository;
import hms.reactive.session.sample.reactivesessionkelaniyauni.repositories.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Resource
    AppRepository appRepository;
    @Resource
    BookRepository bookRepository;

    @RequestMapping("/")
    public String sampleController(){
        return "index";
    }

    @RequestMapping("/movie")
    @ResponseBody
    public List<Movie> getMovieData(@RequestParam(name = "author", required = false) String author){
        LOGGER.debug("Searching Movies for Author [{}]", author);
        if(author == null || author.equals("")){
            List<Movie> all = appRepository.findAll();
            LOGGER.debug("All Movies Count [{}]", all.size());
            return all;
        }else {
            List<Movie> byAuthorApps = appRepository.findByName(author);
            LOGGER.debug("By Director Movie Count [{}]", byAuthorApps.size());
            return byAuthorApps;
        }
    }

    @RequestMapping("/book")
    @ResponseBody
    public List<Book> getBookData(@RequestParam(name = "author", required = false) String author){
        LOGGER.debug("Searching Books for Author [{}]", author);
        if(author == null || author.equals("")){
            List<Book> all = bookRepository.findAll();
            LOGGER.debug("All Book Count [{}]", all.size());
            return all;
        }else {
            List<Book> byAuthorBooks = bookRepository.findByName(author);
            LOGGER.debug("By Author Book Count [{}]", byAuthorBooks.size());
            return byAuthorBooks;
        }
    }
}
