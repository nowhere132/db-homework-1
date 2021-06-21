package nowhere132.dbhomework1.controllers;

import lombok.RequiredArgsConstructor;
import nowhere132.dbhomework1.models.Student;
import nowhere132.dbhomework1.services.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
@CrossOrigin("*")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/get_by_student_id")
    private Student getByStudentId(@RequestParam int studentId) {
        return studentService.getByStudentId(studentId);
    }
}