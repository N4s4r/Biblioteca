public class Book {
    private String name;
    private String author;
    private int[] date;
    private String ISBN;
    private double width;
    public Book(String _name, String _author, int[] _date, String _ISBN){
        name = _name;
        author = _author;
        date = _date;
        ISBN = _ISBN;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int[] getDate(){
        return date;
    }
    public String getISBN(){
        return ISBN;
    }
    public double getWidth(){
        return width;
    }
}