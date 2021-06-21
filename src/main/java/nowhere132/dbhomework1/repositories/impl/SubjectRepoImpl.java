package nowhere132.dbhomework1.repositories.impl;

import lombok.AllArgsConstructor;
import nowhere132.dbhomework1.entities.Subject;
import nowhere132.dbhomework1.repositories.SubjectRepo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
@AllArgsConstructor
public class SubjectRepoImpl implements SubjectRepo {
    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public Subject getBySubjectId(String subjectId) {
        String sql = "SELECT * FROM heroku_b928c868f6376ce.subject where id = :subjectId";
        Query query = entityManager.createNativeQuery(sql, Subject.class);
        query.setParameter("subjectId", subjectId);
        return (Subject) query.getSingleResult();
    }
}