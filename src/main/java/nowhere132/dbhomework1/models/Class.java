package nowhere132.dbhomework1.models;

import lombok.*;

@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Class {
    private int id;
    private String code; // CTE3009 1
    private String periodRange; //7 - 9
    private Integer day; // 7
    private String room; // 305-GĐ2
    private Integer studentThreshold; // 30
    private String note; // CL
    private String courseCode; // CTE3009
    private String type; // CL
    private String lecturer; // ThS.Trần Tuấn Linh
}