package nowhere132.dbhomework1.models;

import lombok.*;

@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Subject {
    private String id; // AER2001
    private Integer credit; // 3
    private String name; // Giới thiệu về Khoa học Vật liệu
}