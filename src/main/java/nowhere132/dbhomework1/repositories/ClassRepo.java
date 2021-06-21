package nowhere132.dbhomework1.repositories;

import nowhere132.dbhomework1.models.Class;

import java.util.List;

public interface ClassRepo {
    List<Class> getByStudentId(int studentId);
}