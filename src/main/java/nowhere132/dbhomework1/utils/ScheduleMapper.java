package nowhere132.dbhomework1.utils;

import nowhere132.dbhomework1.models.schedule.ClassInfo;
import nowhere132.dbhomework1.models.schedule.Schedule;
import nowhere132.dbhomework1.models.Student;

import java.util.List;

public class ScheduleMapper {
    public static Schedule studentClassInfosToSchedule(Student std, List<ClassInfo> classInfos) {
        return Schedule.builder()
                .studentId(std.getId())
                .studentName(std.getFullName())
                .studentBirthday(std.getBirthday())
                .classes(classInfos)
                .build();
    }
}