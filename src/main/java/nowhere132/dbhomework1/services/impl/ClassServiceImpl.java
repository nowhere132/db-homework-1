package nowhere132.dbhomework1.services.impl;

import lombok.RequiredArgsConstructor;
import nowhere132.dbhomework1.entities.Class;
import nowhere132.dbhomework1.repositories.ClassRepo;
import nowhere132.dbhomework1.services.ClassService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {
    private final ClassRepo classRepository;

    @Override
    public List<Class> getByStudentId(int studentId) {
        return classRepository.getByStudentId(studentId);
    }
}