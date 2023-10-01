package one.azer.qalab4sadykhzadehclassroom;

import one.azer.qalab4sadykhzadehclassroom.api.model.Student;
import one.azer.qalab4sadykhzadehclassroom.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class QaLab4SadykhzadehClassroomApplicationTests {

    @Test
    void getAllStudents() {
        List<Student> students = StudentService.getAllStudents();
        assertEquals(3, students.size());
    }

    @Test
    void getStudentById() {
        Student student = StudentService.getStudentById(1);
        assertEquals(1, student.getId());
    }

    @Test
    void getStudentByName() {
        Student student = StudentService.getStudentByName("Azer");
        assertEquals("Azer", student.getName());
    }

    @Test
    void getStudentBySurname() {
        Student student = StudentService.getStudentBySurname("Sadykhzadeh");
        assertEquals("Sadykhzadeh", student.getSurname());
    }

    @Test
    void getStudentByEmail() {
        Student student = StudentService.getStudentByEmail("qwe@qwe.com");
        assertEquals("qwe@qwe.com", student.getEmail());
    }

    @Test
    void getStudentByFaculty() {
        Student student = StudentService.getStudentByFaculty("CS");
        assertEquals("CS", student.getFaculty());
    }
}
