package nowhere132.dbhomework1.repositories;

import nowhere132.dbhomework1.entities.Student;

public interface StudentRepo {
    Student getByStudentId(int studentId);
}