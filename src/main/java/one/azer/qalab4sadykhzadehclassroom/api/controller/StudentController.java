package one.azer.qalab4sadykhzadehclassroom.api.controller;
import one.azer.qalab4sadykhzadehclassroom.api.model.Student;
import one.azer.qalab4sadykhzadehclassroom.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return StudentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable String id) {
        return StudentService.getStudentById(Integer.parseInt(id));
    }

    @GetMapping("/students/{name}")
    public Student getStudentByName(@PathVariable String name) {
        return studentService.getStudentByName(name);
    }

    @GetMapping("/students/{surname}")
    public Student getStudentBySurname(@PathVariable String surname) {
        return studentService.getStudentBySurname(surname);
    }

    @GetMapping("/students/{email}")
    public Student getStudentByEmail(@PathVariable String email) {
        return studentService.getStudentByEmail(email);
    }

    @GetMapping("/students/{faculty}")
    public Student getStudentByFaculty(@PathVariable String faculty) {
        return studentService.getStudentByFaculty(faculty);
    }

    @GetMapping("/students/{group}")
    public Student getStudentByGroup(@PathVariable String group) {
        return studentService.getStudentByGroup(group);
    }

    @GetMapping("/students/{year}")
    public Student getStudentByYear(@PathVariable String year) {
        return studentService.getStudentByYear(Integer.parseInt(year));
    }

    @GetMapping("/students/{gpa}")
    public Student getStudentByGpa(@PathVariable String gpa) {
        return studentService.getStudentByGpa(Double.parseDouble(gpa));
    }

}
