package nowhere132.dbhomework1.controllers;

import lombok.RequiredArgsConstructor;
import nowhere132.dbhomework1.entities.Class;
import nowhere132.dbhomework1.services.ClassService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ClassController {
    private final ClassService classService;

    @GetMapping("/get_by_student_id")
    private List<Class> getByStudentId(@RequestParam int studentId) {
        return classService.getByStudentId(studentId);
    }
}
