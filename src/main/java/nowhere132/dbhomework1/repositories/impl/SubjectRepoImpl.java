package nowhere132.dbhomework1.repositories.impl;

import nowhere132.dbhomework1.models.Subject;
import nowhere132.dbhomework1.repositories.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SubjectRepoImpl implements SubjectRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Subject getBySubjectId(String subjectId) {
        String sql = "select * from heroku_b4d99ba979d476e.subject where id = '" + subjectId + "'";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Subject.class));
    }
}