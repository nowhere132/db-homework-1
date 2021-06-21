package nowhere132.dbhomework1.models;

import lombok.*;

@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Student {
    private int id; // 19020016
    private String fullName; // Trần Hữu Đức Mạnh
    private String birthday; // 24/08/2001
    private String facultyClass; // QH-2019-I/CQ-C-F
}