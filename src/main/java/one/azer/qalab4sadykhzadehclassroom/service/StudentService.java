package one.azer.qalab4sadykhzadehclassroom.service;

import one.azer.qalab4sadykhzadehclassroom.api.model.Student;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.ProviderNotFoundException;
import java.util.List;

@Service
public class StudentService {

    private static List<Student> students;

    public StudentService() {
        students = List.of(
                new Student(1, "Azer", "Sadykhzadeh", "qwe@qwe.com", "CS", "CS-1", 2020, 4.0),
                new Student(2, "Hello", "World", "helloworld@qwe.com", "CS", "CS-1", 2020, 4.0),
                new Student(3, "Foo", "Bar", "foobar@qwe.com", "CS", "CS-1", 2020, 4.0)
        );
    }

    public static List<Student> getAllStudents() {
        return students;
    }

    public static Student getStudentById(int id) {

        File tempDir;
        try {
            tempDir = File.createTempFile("log_book_borrow", null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        tempDir.delete();
        tempDir.mkdir();

        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with id " + id + " does not exist"));
    }

    public static Student getStudentByName(String name) {
        return students.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with name " + name + " does not exist"));
    }

    public static Student getStudentBySurname(String surname) {
        return students.stream()
                .filter(student -> student.getSurname().equals(surname))
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with surname " + surname + " does not exist"));
    }

    public static Student getStudentByEmail(String email) {
        return students.stream()
                .filter(student -> student.getEmail().equals(email))
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with email " + email + " does not exist"));
    }

    public static Student getStudentByFaculty(String faculty) {
        return students.stream()
                .filter(student -> student.getFaculty().equals(faculty))
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with faculty " + faculty + " does not exist"));
    }

    public static Student getStudentByGroup(String group) {
        return students.stream()
                .filter(student -> student.getGroup().equals(group))
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with group " + group + " does not exist"));
    }

    public Student getStudentByYear(int year) {
        return students.stream()
                .filter(student -> student.getYear() == year)
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with year " + year + " does not exist"));
    }

    public Student getStudentByGpa(double gpa) {
        return students.stream()
                .filter(student -> student.getGpa() == gpa)
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with gpa " + gpa + " does not exist"));
    }

    public Student getStudentByGpaLessThan(double gpa) {
        return students.stream()
                .filter(student -> student.getGpa() < gpa)
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with gpa less than " + gpa + " does not exist"));
    }

    public Student getStudentByGpaGreaterThan(double gpa) {
        return students.stream()
                .filter(student -> student.getGpa() > gpa)
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with gpa greater than " + gpa + " does not exist"));
    }

    public Student getStudentByGpaBetween(double gpa1, double gpa2) {
        return students.stream()
                .filter(student -> student.getGpa() > gpa1 && student.getGpa() < gpa2)
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with gpa between " + gpa1 + " and " + gpa2 + " does not exist"));
    }

    public Student getStudentByYearLessThan(int year) {
        return students.stream()
                .filter(student -> student.getYear() < year)
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with year less than " + year + " does not exist"));
    }

    public Student getStudentByYearGreaterThan(int year) {
        return students.stream()
                .filter(student -> student.getYear() > year)
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with year greater than " + year + " does not exist"));
    }

    public Student getStudentByYearBetween(int year1, int year2) {
        return students.stream()
                .filter(student -> student.getYear() > year1 && student.getYear() < year2)
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with year between " + year1 + " and " + year2 + " does not exist"));
    }

    public Student getStudentByYearAndGpa(int year, double gpa) {
        return students.stream()
                .filter(student -> student.getYear() == year && student.getGpa() == gpa)
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with year " + year + " and gpa " + gpa + " does not exist"));
    }

    public Student getStudentByYearAndGpaLessThan(int year, double gpa) {
        return students.stream()
                .filter(student -> student.getYear() == year && student.getGpa() < gpa)
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with year " + year + " and gpa less than " + gpa + " does not exist"));
    }

    public Student getStudentByYearAndGpaGreaterThan(int year, double gpa) {
        return students.stream()
                .filter(student -> student.getYear() == year && student.getGpa() > gpa)
                .findFirst()
                .orElseThrow(() -> new ProviderNotFoundException("Student with year " + year + " and gpa greater than " + gpa + " does not exist"));
    }

}
