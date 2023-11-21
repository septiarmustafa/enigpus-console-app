package model;

import util.BookCode;

import java.util.*;

public class InventoryServiceImpl extends Book implements InventoryService{

    Scanner input = new Scanner(System.in);
    private ArrayList<Novel> listNovel = new ArrayList<>();
    private ArrayList<Magazine> listMagazine = new ArrayList<>();
    private ArrayList<Book> listBook = new ArrayList<>();

    public ArrayList<Novel> getListNovel() {
        return listNovel;
    }

    public void setListNovel(ArrayList<Novel> listNovel) {
        this.listNovel = listNovel;
    }

    public ArrayList<Magazine> getListMagazine() {
        return listMagazine;
    }

    public void setListMagazine(ArrayList<Magazine> listMagazine) {
        this.listMagazine = listMagazine;
    }
    public static void getNameListBook(ArrayList<Book> list){
        System.out.println("\nList All Book: ");
        int index = 0;
        try {
            Book books = null;
            for (Book book: list) {
                index++;
                books = book;
                System.out.println("");
            }
            System.out.println(books == null ? "There's no books\n" : index +". " + books);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void addBook(Integer booktype) {
        try {
            switch (booktype) {
                case 1:
                    System.out.println("Input novel title");
                    String titleNovel = input.nextLine();
                    System.out.println("Input novel publisher");
                    String publisherNovel = input.nextLine();
                    System.out.println("Input novel publication year");
                    Integer publishYearNovel = input.nextInt();
                    System.out.println("Input novel writer");
                    input.nextLine();
                    String writerNovel = input.nextLine();
                    Novel novel = new Novel(BookCode.generateCode(publishYearNovel,booktype),titleNovel,publisherNovel,publishYearNovel,writerNovel);
                    listNovel.add(novel);
                    listBook.add(novel);
                    BookCode.setCodeBookId(BookCode.getCodeBookId() + 1);
                    getNameListBook(listBook);
                    break;
                case 2:
                    System.out.println("Input magazine title");
                    String titleMag = input.nextLine();
                    System.out.println("Input magazine period");
                    String periodMag = input.nextLine();
                    System.out.println("Input magazine publication year");
                    Integer publishYearMag = input.nextInt();
                    Magazine magazine = new Magazine(BookCode.generateCode(publishYearMag,booktype),titleMag,periodMag,publishYearMag);
                    listMagazine.add(magazine);
                    BookCode.setCodeBookId(BookCode.getCodeBookId() + 1);
                    listBook.add(magazine);
                    getNameListBook(listBook);
                    break;
                case 3:
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public void searchBookByTitle(String title) {
        try {
            Book foundBook = null;
            for (Book book : listBook) {
                if (title.equals(book.getTitle())) {
                    foundBook = book;
                    break;
                }
            }
            if (foundBook != null) {
                System.out.println("Book found : " + foundBook);
            } else {
                System.out.println( "Sorry, Book not found ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void searchBookById(String bookId) {
        try {
            Book foundBook = null;

            for (Book book : listBook) {
                if (bookId.equals(book.getId())) {
                    foundBook = book;
                    break;
                }
            }
            if (foundBook != null) {
                System.out.println("Book found with id [" + bookId + "] : " + foundBook);
            } else {
                System.out.println( "Sorry, Book not found ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public void deleteBook(String removeBook) {
        try {
            String removed = null;
            for (int i = 0; i < listBook.size(); i++) {
                if (removeBook.equals(listBook.get(i).getTitle())){
                    removed = String.valueOf(listBook.get(i));
                    listBook.remove(listBook.get(i));
                    BookCode.setCodeBookId(BookCode.getCodeBookId() - 1);
                }
            }
            System.out.println(removed == null ? "Can't delete, there is no such book " : "Successfully removed " + removed);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public ArrayList<Book> getAllBook() {
        getNameListBook(listBook);
        return listBook;
    }
    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public String getId() {
        return null;
    }
}
