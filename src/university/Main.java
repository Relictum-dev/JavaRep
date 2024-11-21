package university;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Group group = new Group(1);  // создаем группу с номером 1

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Найти студента по номеру зачетной книжки");
            System.out.println("4. Показать всех студентов");
            System.out.println("5. Показать отсортированных студентов");
            System.out.println("6. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();  // потребление оставшегося символа новой строки

            switch (choice) {
                case 1:
                    System.out.print("Введите имя студента: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Введите фамилию студента: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Введите номер зачетной книжки: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();  // потребление оставшегося символа новой строки
                    Student newStudent = new Student(firstName, lastName, bookId);
                    group.addStudent(newStudent);
                    System.out.println("Студент добавлен.");
                    break;

                case 2:
                    System.out.print("Введите номер зачетной книжки студента, которого нужно удалить: ");
                    int bookIdToDelete = scanner.nextInt();
                    scanner.nextLine();  // потребление оставшегося символа новой строки
                    group.removeStudent(bookIdToDelete);
                    System.out.println("Студент удален.");
                    break;

                case 3:
                    System.out.print("Введите номер зачетной книжки студента для поиска: ");
                    int bookIdToFind = scanner.nextInt();
                    scanner.nextLine();  // потребление оставшегося символа новой строки
                    Student foundStudent = group.findStudentByBookId(bookIdToFind);
                    if (foundStudent != null) {
                        System.out.println("Студент найден: " + foundStudent.getFirstName() + " " + foundStudent.getLastName());
                    } else {
                        System.out.println("Студент не найден.");
                    }
                    break;

                case 4:
                    System.out.println("Все студенты:");
                    for (Student student : group.getStudents()) {
                        System.out.println(student.getFirstName() + " " + student.getLastName() + ", Номер зачетной книжки: " + student.getBookId());
                    }
                    break;

                case 5:
                    System.out.println("Отсортированные студенты:");
                    for (Student student : group.getSortedStudents()) {
                        System.out.println(student.getFirstName() + " " + student.getLastName());
                    }
                    break;

                case 6:
                    System.out.println("Выход из программы.");
                    scanner.close();  // закрытие сканера
                    return;  // завершение программы

                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}
