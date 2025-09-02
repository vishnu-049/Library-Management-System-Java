import java.util.*;
class Library {
    private ArrayList<Book>books = new ArrayList<>();
    private HashMap<Integer, User> users = new HashMap<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void registerUser(User user){
        users.put(user.getId(),user);
    }
    public void searchBook(String Keyword){
        for( Book bk : books){
            if(bk.getTitle().toLowerCase().contains(Keyword.toLowerCase()) ||
            bk.getAuthor().toLowerCase().contains(Keyword.toLowerCase())){
                System.out.println(bk);
            }
        }
    }
    public void borrowBook(int bookId, int userId){
        for(Book bk : books){
             if(bk.getId() == bookId ){
                if(bk.isAvailable()){
                    bk.borrowBook();
                    System.out.println("User "+userId+" Borrowed : "+bk.getTitle());
                }
                else{
                    System.out.println("sorry is already Borrowed!");
                }
                return;
             }
       }
       System.out.println("Book not Available");

    }
    public void returnBook(int bookID, int userID){
        for(Book bk : books){
            if(bk.getId() == bookID && !bk.isAvailable()){
                bk.setAvailable(true);
                System.out.println(users.get(userID).getName()+" returned "+bk.getTitle());
                return;
            }
            
        }
        System.out.println("Didn't returnted yet!");
        

    }
    public void showAllBooks(){
        for(Book bk : books){
            System.out.println(bk);
        }
    }
       
}
