abstract class User {
    protected int id;
    protected String name;

    public User(int id, String name){
        this.id =id;
        this.name = name;
    }
    public int getId(){return id;}
    public String getName(){return name;}

    public String toString(){
        return " UserId: "+id +", Name: "+name;
    }

    class Student extends User{
        public Student(int id, String name){
            super(id, name);
        }
    }
    class Teacher extends User{
        public Teacher(int id, String name){
            super(id, name);
        }
    }
}
