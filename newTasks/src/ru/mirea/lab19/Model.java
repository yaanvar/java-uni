package ru.mirea.lab19;
import java.util.Arrays;

public class Model {
    private Student[] students = new Student[10];
    private int numStudents = 0;

    public void addStudent(Student student) {
        students[numStudents] = student;
        numStudents++;
    }

    public void removeStudent(String studentName) throws StudentNotFoundException {
        int index = -1;
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getName().equals(studentName)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new StudentNotFoundException();
        }
        for (int i = index; i < numStudents; i++) {
            students[i] = students[i + 1];
        }
        numStudents--;
    }

    public Student getStudent(String studentName) throws StudentNotFoundException {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getName().equals(studentName)) {
                return students[i];
            }
        }
        throw new StudentNotFoundException();
    }

    @Override
    public String toString() {
        return "LabClass{" +
                "students=" + Arrays.toString(students) +
                ", numStudents=" + numStudents +
                '}';
    }
}