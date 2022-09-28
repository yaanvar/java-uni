package ru.mirea.lab2;

import java.util.*;

/*
Создать класс, описывающий книгу (Book). В классе должны быть описаны нужные свойства книги
(автор, название, год написания и т. д.) и методы для получения, изменения этих свойств.
Протестировать работу класса в классе BookTest, содержащим метод статический main(String[] args).
*/

public class Book {
    String author;
    String title;
    Integer yearOfPublishing;

    public Book(String author, String title, Integer yearOfPublishing) {
        this.author = author;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    Integer getYearOfPublishing() {
        return yearOfPublishing;
    }

    void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }

    public Book() {
    }
}

class TestBook {
    public static void test(){
        Book book = new Book("Franz Kafka", "Amerika", 1905);
        System.out.println(book.getAuthor());
        Scanner scan = new Scanner(System.in);
        Integer newYearOfPublishing = scan.nextInt();
        book.setYearOfPublishing(newYearOfPublishing);
        System.out.println(book.getYearOfPublishing());
    }
}
