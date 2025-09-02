import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Library lb = new Library();
        Scanner sc = new Scanner(System.in);

        lb.addBook(new Book(1,"JAVA Fundamentals","james Clear",true));
        lb.addBook(new Book(2, "Data Structures", "colhelo", true));
        lb.registerUser(new Student(101, "Vishnu"));
        lb.registerUser(new Teacher(201, "Dr. Sharma"));

        while (true){
             System.out.println("\n=== Library Menu ===");
            System.out.println("1. Show Books");
            System.out.println("2. Search Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: lb.showAllBooks(); break;
                case 2:
                    System.out.print("Enter keyword: ");
                    String key = sc.next();
                    lb.searchBook(key);
                    break;
                case 3:
                    System.out.print("Enter Book ID and User ID: ");
                    int b1 = sc.nextInt(), u1 = sc.nextInt();
                    lb.borrowBook(b1, u1);
                    break;
                case 4:
                    System.out.print("Enter Book ID and User ID: ");
                    int b2 = sc.nextInt(), u2 = sc.nextInt();
                    lb.returnBook(b2, u2);
                    break;
                case 5: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }

}
