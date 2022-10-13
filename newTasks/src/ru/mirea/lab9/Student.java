package ru.mirea.lab9;

public class Student implements Comparable<Student> {
    Integer id;
    Double gpa;

    public Student(Integer id, Double gpa) {
        this.id = id;
        this.gpa = gpa;
    }
    public Integer getId() {
        return id;
    }

    public Double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(getId(), otherStudent.getId());
    }
}


class TestStudent {
    static Student[] insertSort(Student[] students) {
        for (int left = 0; left < students.length; left++) {
            int value = students[left].getId();
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < students[i].getId()) {
                    students[i + 1].id = students[i].getId();
                } else {
                    break;
                }
            }
            students[i + 1].id = value;
        }
        return students;
    }

    public static void main(String[] args){
        //Cоздать массив класса Student
        //сортировать массив iDNumber и сортировать его вставками.

        Student[] students = new Student[5];
        students[0] = new Student(12, 3.1);
        students[1] = new Student(2, 3.3);
        students[2] = new Student(22, 1.7);
        students[3] = new Student(11, 4.0);
        students[4] = new Student(15, 2.9);

        students = TestStudent.insertSort(students);

        for(int i = 0; i < students.length; i++) {
            System.out.println("Student: id - " + students[i].getId());
        }

    }
}

class SortingStudentsByGPA {
    static Student[] quickSort(Student[] students, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        double pivot = students[(leftMarker + rightMarker) / 2].getGpa();
        do {
            while (students[leftMarker].getGpa() > pivot) {
                leftMarker++;
            }
            while (students[rightMarker].getGpa() < pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    double tmp = students[leftMarker].getGpa();
                    students[leftMarker].gpa = students[rightMarker].getGpa();
                    students[rightMarker].gpa = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSort(students, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(students, leftBorder, rightMarker);
        }
        return students;
    }

    public static void main(String[] args){

        // Напишите класс SortingStudentsByGPA который реализует интерфейс
        // Comparator таким образом, чтобы сортировать список студентов по их
        // итоговымбаллам в порядке убывания с использованием алгоритма быстрой сортировки..

        Student[] students = new Student[5];
        students[0] = new Student(12, 3.1);
        students[1] = new Student(2, 3.3);
        students[2] = new Student(22, 1.7);
        students[3] = new Student(11, 4.0);
        students[4] = new Student(15, 2.9);

        students = SortingStudentsByGPA.quickSort(students, 0, students.length - 1);

        for(int i = 0; i < students.length; i++) {
            System.out.println("Student: gpa - " + students[i].getGpa());
        }

    }
}

class MergeStudents {

    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].getGpa() <= r[j].getGpa()) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    static Student[] mergeStudents(Student[] a, Student[] b) {
        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;
        Student[] c = new Student[c1];
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
        mergeSort(c, c.length);
        return c;
    }

    public static void main(String[] args){

        // Напишите программу, которая объединяет два списка данных о студентах
        // в один отсортированный списках с использованием алгоритма сортировки слиянием.

        Student[] students1 = new Student[2];
        Student[] students2 = new Student[3];
        students1[0] = new Student(12, 3.1);
        students1[1] = new Student(2, 3.3);
        students2[0] = new Student(22, 1.7);
        students2[1] = new Student(11, 4.0);
        students2[2] = new Student(15, 2.9);

        Student[] students = mergeStudents(students1, students2);

        for(int i = 0; i < students.length; i++) {
            System.out.println("Student: gpa - " + students[i].getGpa());
        }

    }
}