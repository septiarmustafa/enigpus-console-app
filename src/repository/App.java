package repository;

import model.InventoryServiceImpl;

import java.util.Scanner;

public class App {
    public void run (){
        InventoryServiceImpl inventoryService = new InventoryServiceImpl();
        boolean isExit = false;
        Scanner input = new Scanner(System.in);

        try {
            while (!isExit) {
                System.out.println("\n ------ ENIGPUS ONLINE ------ ");
                System.out.println(" ----------- MENU ----------- ");
                System.out.println("1. Add book");
                System.out.println("2. Search book by title");
                System.out.println("3. Search book by Id");
                System.out.println("4. Delete book");
                System.out.println("5. Show all book");
                System.out.println("6. Exit");
                System.out.print("Select menu : ");

                int menu = input.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("\nChoose book type");
                        System.out.println("1. Novel");
                        System.out.println("2. Magazine");
                        System.out.println("3. Back");
                        System.out.print("Select menu : ");
                        int bookType = input.nextInt();
                        inventoryService.addBook(bookType);
                        break;
                    case 2:
                        System.out.print("Input book title: ");
                        input.nextLine();
                        String title = input.nextLine();
                        inventoryService.searchBookByTitle(title);
                        break;
                    case 3:
                        System.out.print("Input book id: ");
                        input.nextLine();
                        String bookId = input.nextLine();
                        inventoryService.searchBookById(bookId);
                        break;
                    case 4:
                        System.out.print("Input book title for delete: ");
                        input.nextLine();
                        String removeBook = input.nextLine();
                        inventoryService.deleteBook(removeBook);
                        break;
                    case 5:
                        inventoryService.getAllBook();
                        break;
                    case 6:
                        isExit = true;
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
