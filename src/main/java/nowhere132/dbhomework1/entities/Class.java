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
@Table(name = "class")
public class Class {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "periodRange")
    private String periodRange;

    @Column(name = "day")
    private Integer day;

    @Column(name = "room")
    private String room;

    @Column(name = "studentThreshold")
    private Integer studentThreshold;

    @Column(name = "note")
    private String note;

    @Column(name = "courseCode")
    private String courseCode;

    @Column(name = "type")
    private String type;

    @Column(name = "lecturer")
    private String lecturer;
}