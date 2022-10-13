package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Comparator;

class Student {
    String firstName;
    String secondName;
    String major;
    Integer year;
    String group;

    Integer id;

    public Student(String firstName, String secondName, String major, Integer year, String group, Integer id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.major = major;
        this.year = year;
        this.group = group;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}

class StudentComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getId().compareTo(b.getId());
    }

}

class SortingStudentsByGPA {

    static ArrayList<Student> iDNumber = new ArrayList<>();

    static ArrayList<Student> mergeSort(ArrayList<Student> students, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        double pivot = students.get((leftMarker + rightMarker) / 2).getId();
        do {
            while (students.get(leftMarker).getId() > pivot) {
                leftMarker++;
            }
            while (students.get(rightMarker).getId() < pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Integer tmp = students.get(leftMarker).getId();
                    students.get(leftMarker).id = students.get(rightMarker).getId();
                    students.get(rightMarker).id = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            mergeSort(students, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            mergeSort(students, leftBorder, rightMarker);
        }
        return students;
    }

    static void setArray() {
        Student student = new Student("Vasiliy", "Pupkin", "CS", 3, "CSBO-01-20", 34);
        iDNumber.add(student);
        student = new Student("Alexey", "Pronin", "SI", 2, "SIBO-01-21", 12);
        iDNumber.add(student);
        student = new Student("Oleg", "Krokopenko", "PI", 1, "PIBO-01-22", 223);
        iDNumber.add(student);
        student = new Student("Ivan", "Prishvin", "FD", 4, "FDBO-01-19", 121);
        iDNumber.add(student);
        student = new Student("Ilya", "Pasternak", "SD", 2, "SDBO-01-21", 90);
        iDNumber.add(student);
    }

    static ArrayList<Student> mergeArrays(ArrayList<Student> students1, ArrayList<Student> students2) {
        for(int i = 0; i < students2.size(); i++) {
            students1.add(students2.get(i));
        }
        return students1;
    }

    static void outArray() {
        for(int i = 0; i < iDNumber.size(); i++) {
            System.out.println("Student: id - " + iDNumber.get(i).getId());
        }
    }




    public static void main(String[] args){
        //Cоздать массив класса Student
        //сортировать массив iDNumber и сортировать его быстрой сортировкой.
        setArray();
        System.out.println("Old Array");
        outArray();
        System.out.println("New Array");
        iDNumber = mergeSort(iDNumber, 0, iDNumber.size() - 1);
        outArray();

    }
}