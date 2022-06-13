package BookSorter;

public class Book implements Comparable<Book>{

    private String bookName;
    private int bookNumber;
    private String authorName;
    private int releaseDate;

    public Book(String bookName, int bookNumber, String authorName, int releaseDate){

        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.authorName = authorName;
        this.releaseDate = releaseDate;

    }

    public String getBookName(){

        return this.bookName;

    }

    public void setBookName(String bookName){

        this.bookName = bookName;

    }

    public int getBookNumber(){

        return this.bookNumber;

    }

    public void setBookNumber(int bookNumber){

        this.bookNumber = bookNumber;

    }

    public String getAuthorName(){

        return this.authorName;

    }

    public void setAuthorName(String authorName){

        this.authorName=authorName;

    }

    public int getReleaseDate(){

        return this.releaseDate;

    }

    public void setReleaseDate(int releaseDate){

        this.releaseDate= releaseDate;

    }

    @Override
    public int compareTo(Book book) {
        return getBookName().compareTo(book.getBookName());
    }
}
