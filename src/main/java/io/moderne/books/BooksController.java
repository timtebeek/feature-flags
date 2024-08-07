package io.moderne.books;

import java.util.List;

class BooksController {

    private final SearchService searchService;

    public BooksController(SearchService searchService) {
        this.searchService = searchService;
    }

    public List<Book> search(String query) {
        return searchService.search(query);
    }
}
