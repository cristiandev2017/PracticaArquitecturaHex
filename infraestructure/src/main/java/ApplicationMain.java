import App.ConsoleApp;
import infra.repository.BooksRepositoryImpl;
import services.BooksService;
import services.BooksServiceFactory;

public class ApplicationMain {
    public static void main(String[] args) {
        BooksService booksService = BooksServiceFactory.getBooksService(new BooksRepositoryImpl());
        ConsoleApp consoleApp = new ConsoleApp(System.console(), booksService);
        consoleApp.waitForCommand();
    }
}
