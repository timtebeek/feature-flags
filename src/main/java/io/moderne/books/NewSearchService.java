package io.moderne.books;

import java.util.List;

class NewSearchService implements SearchService {

    @Override
    public List<Book> search(String titleOrAuthor) {
        return getAllBooks().stream()
                .filter(book -> book.title().toLowerCase().contains(titleOrAuthor.toLowerCase()) ||
                                book.author().toLowerCase().contains(titleOrAuthor.toLowerCase()))
                .toList();
    }
}
