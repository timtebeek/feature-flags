package io.moderne.books;

import java.util.List;

class NewSearchService implements SearchService {

    private final BooksService booksService = new BooksService();

    @Override
    public List<Book> search(String titleOrAuthor) {
        return booksService.getAllBooks().stream()
                .filter(book -> book.title().toLowerCase().contains(titleOrAuthor.toLowerCase()) ||
                                book.author().toLowerCase().contains(titleOrAuthor.toLowerCase()))
                .toList();
    }
}
