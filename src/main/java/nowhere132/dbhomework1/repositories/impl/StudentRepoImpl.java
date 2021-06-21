package nowhere132.dbhomework1.repositories.impl;

import nowhere132.dbhomework1.models.Student;
import nowhere132.dbhomework1.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepoImpl implements StudentRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Student getByStudentId(int studentId) {
        String sql = "select * from heroku_b4d99ba979d476e.student std where std.id = " + studentId;
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class));
    }
}