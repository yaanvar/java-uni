package ru.mirea.lab2;

import java.util.*;

/*
Создать класс книжная полка, в котором поля данных класса это массив объектов типа книги
(Book, и количество книг на книжной полке. Написать методы класса, которые возвращают книги с самым поздним
и самым ранним сроком издания. Написать метод класса, позволяющий расставить книги на книжной полке в порядке
возрастания года выпуска.
*/

public class Bookshelf {
    ArrayList<Book> books = new ArrayList<Book>();
    int amountOfBooks = books.size();

    Book getMostRecentBook() {
        Book temp = (Book) books.toArray()[0];
        Book[] booksArray = (Book[]) books.toArray();
        for(int i = 1; i < amountOfBooks; i++) {
            if (booksArray[i].getYearOfPublishing() <= booksArray[i - 1].getYearOfPublishing()) {
                temp = booksArray[i];
            }
        }
        return temp;
    }

    Book getOldestBook() {
        Book temp = (Book) books.toArray()[0];
        Book[] booksArray = (Book[]) books.toArray();
        for(int i = 1; i < amountOfBooks; i++) {
            if (booksArray[i].getYearOfPublishing() >= booksArray[i - 1].getYearOfPublishing()) {
                temp = booksArray[i];
            }
        }
        return temp;
    }

    void sortBookshelf() {
        Collections.sort(books, new BookComparator());
    }
}

class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return a.getYearOfPublishing() < b.getYearOfPublishing() ? -1 : a.getYearOfPublishing() == b.getYearOfPublishing() ? 0 : 1;
    }
}