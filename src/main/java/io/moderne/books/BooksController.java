package io.moderne.books;

import java.util.List;

class BooksController {

    public List<Book> search(String query) {
        return new OldSearchService().search(query);
    }

//    // Alternative implementation that toggles between two implementations
//    private dev.openfeature.sdk.Client client;
//
//    public List<Book> search(String query) {
//        if (client.getBooleanValue("use-new-search-service", true)) {
//            // Search across titles and authors
//            return new NewSearchService().search(query);
//        } else {
//            // Search across titles only
//            return new OldSearchService().search(query);
//        }
//    }
}
