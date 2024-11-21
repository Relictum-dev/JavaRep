package university;

public class Student {
    private String firstName;
    private String lastName;
    private int yearOfAdmission;
    private int bookId;  // 6-digit unique book id

    // Конструктор с именем и фамилией
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookId = 0;  // по умолчанию 0
    }

    // Конструктор с именем, фамилией и номером зачетной книжки
    public Student(String firstName, String lastName, int bookId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookId = bookId;
    }

    // Методы получения и изменения данных
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }
}
