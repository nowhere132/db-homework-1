package nowhere132.dbhomework1.services.impl;

import lombok.RequiredArgsConstructor;
import nowhere132.dbhomework1.models.Student;
import nowhere132.dbhomework1.repositories.StudentRepo;
import nowhere132.dbhomework1.services.StudentService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepository;

    @Override
    public Student getByStudentId(int studentId) {
        return studentRepository.getByStudentId(studentId);
    }
}