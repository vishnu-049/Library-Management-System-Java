public class Book{
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;
   // public boolean setAvailable;

    public Book(int id, String title, String author, boolean isAvailable){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public int getId(){return id;}
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    
    public boolean isAvailable(){return isAvailable;}

    public void setAvailable(boolean status){this.isAvailable = status;}
    public void borrow(){
        isAvailable = false;
    }
    public void returnBook(){
        isAvailable = true;
    }

    public String toString(){
        return "Book id: "+id+" title:"+title+" Author:" +author + "Available:"+(isAvailable ? "yes":"no");
    }
    public void borrowBook(){
        if(isAvailable){
            isAvailable = false;
        }
        else{
            System.out.println("Book is already borrowed!");
        }
    }
    
    
}