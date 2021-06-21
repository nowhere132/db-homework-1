package nowhere132.dbhomework1.repositories.impl;

import lombok.AllArgsConstructor;
import nowhere132.dbhomework1.entities.Class;
import nowhere132.dbhomework1.repositories.ClassRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@AllArgsConstructor
public class ClassRepoImpl implements ClassRepo {
    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public List<Class> getByStudentId(int studentId) {
        String sql = "SELECT * FROM heroku_b928c868f6376ce.class c" +
                " join heroku_b928c868f6376ce.student_class_mapping sc on c.id = sc.classId" +
                " where studentId = :studentId";
        Query query = entityManager.createNativeQuery(sql, Class.class);
        query.setParameter("studentId", studentId);
        return (List<Class>) query.getResultList();
    }
}