package nowhere132.dbhomework1.models.schedule;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ClassInfo {
    private String code;
    private String name;
    private Integer startPeriod;
    private Integer finishPeriod;
    private Integer day;
    private String room;
    private Integer threshold;
    private String type;
    private String lecturer;
}