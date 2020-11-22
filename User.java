import java.util.LinkedList;

public class User {
    private String name;
    private int[] birth;
    private LinkedList<Book> currentBooks;
    private LinkedList<Book> readBooks;
    public User(String _name, int[] _birth){
        name = _name;
        birth = _birth;
        currentBooks = new LinkedList<Book>();
        readBooks = new LinkedList<Book>();
    }
    public String getName(){
        return name;
    }
    public int[] getBirth(){
        return birth;
    }
    public LinkedList<Book> getCurrentBooks(){
        return currentBooks;
    }
    public LinkedList<Book> getReadBooks(){
        return readBooks;
    }
    public void read(Book book){
        if (! readBooks.contains(book)){
            readBooks.add(book);
        }
    }
}
