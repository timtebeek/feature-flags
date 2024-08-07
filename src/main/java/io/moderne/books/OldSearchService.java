package io.moderne.books;

import java.util.List;

class OldSearchService implements SearchService {

    private final BooksService booksService = new BooksService();

    @Override
    public List<Book> search(String title) {
        return booksService.getAllBooks().stream()
                .filter(book -> book.title().toLowerCase().contains(title.toLowerCase()))
                .toList();
    }
}
