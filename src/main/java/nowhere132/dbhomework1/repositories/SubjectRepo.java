package nowhere132.dbhomework1.repositories;

import nowhere132.dbhomework1.entities.Subject;

public interface SubjectRepo {
    Subject getBySubjectId(String subjectId);
}