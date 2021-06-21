package nowhere132.dbhomework1.repositories.impl;

import lombok.AllArgsConstructor;
import nowhere132.dbhomework1.entities.Student;
import nowhere132.dbhomework1.repositories.StudentRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
@AllArgsConstructor
public class StudentRepoImpl implements StudentRepo {
    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public Student getByStudentId(int studentId) {
        System.out.println("/------------------------");
        System.out.println("DEBUGGING: " + studentId);
        System.out.println("/------------------------");
        String sql = "SELECT * from heroku_b928c868f6376ce.student WHERE id = :studentId";
        Query query = entityManager.createNativeQuery(sql, Student.class);
        query.setParameter("studentId", studentId);
        return (Student) query.getSingleResult();
    }
}