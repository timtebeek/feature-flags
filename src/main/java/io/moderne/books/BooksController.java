package io.moderne.books;

import java.util.List;

class BooksController {

    public List<Book> search(String query) {
        SearchService oldSearchService = new OldSearchService();
        return oldSearchService.search(query);
    }

    private dev.openfeature.sdk.Client client;

//    public List<Book> search(String query) {
//        if (client.getBooleanValue("use-new-search-service", true)) {
//            SearchService oldSearchService = new NewSearchService();
//            return oldSearchService.search(query);
//        } else {
//            SearchService oldSearchService = new OldSearchService();
//            return oldSearchService.search(query);
//        }
//    }
}
