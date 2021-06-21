package nowhere132.dbhomework1.repositories.impl;

import nowhere132.dbhomework1.models.Class;
import nowhere132.dbhomework1.repositories.ClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClassRepoImpl implements ClassRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Class> getByStudentId(int studentId) {
        String sql = "select * from heroku_b4d99ba979d476e.class c" +
                " join heroku_b4d99ba979d476e.student_class_mapping sc on c.id = sc.classId" +
                " where studentId = " + studentId;
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Class.class));
    }
}