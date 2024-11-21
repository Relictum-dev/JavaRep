package university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
    private int groupNumber;
    private List<Student> students;

    // Конструктор с номером группы и пустым списком студентов
    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    // Конструктор с номером группы и массивом студентов
    public Group(int groupNumber, List<Student> students) {
        this.groupNumber = groupNumber;
        this.students = students;
    }

    // Методы для работы с группой
    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public Student findStudentByBookId(int bookId) {
        for (Student student : students) {
            if (student.getBookId() == bookId) {
                return student;
            }
        }
        return null;  // Студент не найден
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int bookId) {
        students.removeIf(student -> student.getBookId() == bookId);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> getSortedStudents() {
        students.sort((s1, s2) -> {
            int lastNameComparison = s1.getLastName().compareTo(s2.getLastName());
            if (lastNameComparison == 0) {
                return s1.getFirstName().compareTo(s2.getFirstName());
            }
            return lastNameComparison;
        });
        return students;
    }
}
