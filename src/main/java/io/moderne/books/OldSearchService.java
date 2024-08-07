package io.moderne.books;

import java.util.List;

class OldSearchService implements SearchService {

    @Override
    public List<Book> search(String title) {
        return getAllBooks().stream()
                .filter(book -> book.title().toLowerCase().contains(title.toLowerCase()))
                .toList();
    }
}
