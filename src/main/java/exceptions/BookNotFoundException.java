package exceptions;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookNotFoundException() {
        System.out.println("Ошибка запроса по id");
    }

    // ...
}