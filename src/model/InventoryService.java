package model;

import java.util.ArrayList;

public interface InventoryService {
    void addBook(Integer bookType);
    void searchBookByTitle(String title);
    void searchBookById(String id);
    void deleteBook(String removeBook);
    ArrayList<Book> getAllBook();
}
