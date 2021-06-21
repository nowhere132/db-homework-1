package nowhere132.dbhomework1.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "facultyClass")
    private String facultyClass;
}