package BookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Book> bookList = new TreeSet<>();

        Book bookInformationOne = new Book("Söz söyleme ve iş bitirme sanatı", 223, "Dale Carnegie", 2016);
        Book bookInformationTwo = new Book("Hızlı ve Yavaş Düşünmeustalık", 568, "Daniel Kahneman", 2016);
        Book bookInformationTree = new Book("Ustalık", 416, "Robert Greene", 2015);
        Book bookInformationFour = new Book("Beyaz Diş", 288, "Jack London", 2010);
        Book bookInformationFive = new Book("Zar Adam", 464, "Luke Rhinehart", 2017);


        bookList.add(bookInformationOne);
        bookList.add(bookInformationTwo);
        bookList.add(bookInformationTree);
        bookList.add(bookInformationFour);
        bookList.add(bookInformationFive);
        

        System.out.println("Sorter by Name : ");
        for (Book books : bookList) {

            System.out.println("Book Name :" + books.getBookName() +
                    ",\tBook Number :" + books.getBookNumber() +
                    ",\tBook AuthorName :" + books.getAuthorName() +
                    ",\tBook ReleaseDate" + books.getReleaseDate());

        }

        TreeSet<Book> bookListTwo = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookNumber()-o2.getBookNumber();
            }
        });

        bookListTwo.addAll(bookList);

        System.out.println("------------------");
        System.out.println("Sorter By Book Number");

        for (Book books : bookListTwo){

            System.out.println("Book Name :" + books.getBookName() +
                    ",\tBook Number :" + books.getBookNumber() +
                    ",\tBook AuthorName :" + books.getAuthorName() +
                    ",\tBook ReleaseDate" + books.getReleaseDate());

        }

    }

}
