package io.moderne.books;

import java.util.List;

public interface SearchService {
    List<Book> search(String query);
}
