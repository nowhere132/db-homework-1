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
@Table(name = "subject")
public class Subject {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "credit")
    private Integer credit;

    @Column(name = "name")
    private String name;
}