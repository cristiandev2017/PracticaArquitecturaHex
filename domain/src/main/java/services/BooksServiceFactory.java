package services;

import infra.repository.BooksRepository;

public class BooksServiceFactory {
    public static BooksService getBooksService(BooksRepository booksRepository){
        return new BooksServiceImpl(booksRepository);
    }
}
