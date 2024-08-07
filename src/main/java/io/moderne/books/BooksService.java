package io.moderne.books;

import java.util.List;

class BooksService {
    public List<Book> getAllBooks() {
        return List.of(
                new Book("The Catcher in the Rye", "J.D. Salinger"),
                new Book("To Kill a Mockingbird", "Harper Lee"),
                new Book("1984", "George Orwell"),
                new Book("Pride and Prejudice", "Jane Austen"),
                new Book("The Great Gatsby", "F. Scott Fitzgerald")
        );
    }
}
