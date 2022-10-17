package ru.mirea.lab11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateTask {

    public static void main(String[] args) throws ParseException {
        // Написать программу, выводящую фамилию разработчика, дату и время получения задания,
        // а также дату и время сдачи задания. Для получения последней даты и времени использовать
        // класс Date из пакета java.util.* (Объявление Dated=newDate() или метод System.currentTimeMillis().
        System.out.println("Rakhimov");
        Date yesterday = new Date(System.currentTimeMillis() - 1000L * 60L * 60L * 24L);
        SimpleDateFormat dateFormatter = new SimpleDateFormat();
        System.out.println("Task given: " + dateFormatter.format(yesterday));
        System.out.println("Task complete: " + dateFormatter.format(System.currentTimeMillis()));


        // Приложение, сравнивающее текущую дату и дату, введенную пользователем c текущим системным временем
        Date date1 = new Date(System.currentTimeMillis() - 1000L * 60L * 60L * 24L * 2L);
        Date date2 = new Date(System.currentTimeMillis());
        if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 is after Date2");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Date2");
        } else {
            System.out.println("Date1 is equal to Date2");
        }

        // Напишите пользовательский код, который формирует объекты Date и Calendar по следующим данным,
        // вводимым пользователем:
        // <Число><Месяц><Год>
        // <Часы1><минуты>

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMM-dd", Locale.ENGLISH);

        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        String month = sc.nextLine();
        String year = sc.nextLine();
        String dateInString = day + "/" + month + "/" + year;
        dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormatter.parse(dateInString);
        System.out.println(date);
        System.out.println(formatter.format(date));


    }
}
