package nowhere132.dbhomework1.services;

import nowhere132.dbhomework1.models.Class;

import java.util.List;

public interface ClassService {
    List<Class> getByStudentId(int studentId);
}
