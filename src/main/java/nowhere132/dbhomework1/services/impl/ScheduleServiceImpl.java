package nowhere132.dbhomework1.services.impl;

import lombok.RequiredArgsConstructor;
import nowhere132.dbhomework1.errors.CustomException;
import nowhere132.dbhomework1.entities.Class;
import nowhere132.dbhomework1.entities.Subject;
import nowhere132.dbhomework1.entities.schedule.ClassInfo;
import nowhere132.dbhomework1.entities.schedule.Schedule;
import nowhere132.dbhomework1.entities.Student;
import nowhere132.dbhomework1.repositories.ClassRepo;
import nowhere132.dbhomework1.repositories.StudentRepo;
import nowhere132.dbhomework1.repositories.SubjectRepo;
import nowhere132.dbhomework1.services.ScheduleService;
import nowhere132.dbhomework1.utils.ClassInfoMapper;
import nowhere132.dbhomework1.utils.ScheduleMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {
    private final ClassRepo classRepo;
    private final StudentRepo studentRepo;
    private final SubjectRepo subjectRepo;

    @Override
    public Schedule getByStudentId(int studentId) {
        Student student = null;
        try {
            student = studentRepo.getByStudentId(studentId);
        } catch (EmptyResultDataAccessException e) {
            throw new CustomException(HttpStatus.BAD_REQUEST, "STUDENT_ID_INVALID");
        }

        List<Class> classes = null;
        try {
            classes = classRepo.getByStudentId(studentId);
        } catch (EmptyResultDataAccessException e) {
            throw new CustomException(HttpStatus.NOT_FOUND, "CLASSES_NOT_FOUND");
        }

        List<ClassInfo> classInfos = classes.stream().map(c -> {
            Subject subj = subjectRepo.getBySubjectId(c.getCourseCode());
            return ClassInfoMapper.classSubjectToClassInfo(c, subj);
        }).collect(Collectors.toList());

        return ScheduleMapper.studentClassInfosToSchedule(student, classInfos);
    }
}