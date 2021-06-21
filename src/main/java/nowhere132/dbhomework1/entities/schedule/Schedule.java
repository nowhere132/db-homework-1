package nowhere132.dbhomework1.entities.schedule;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Schedule {
    private Integer studentId;
    private String studentName;
    private String studentBirthday;
    private List<ClassInfo> classes;
}