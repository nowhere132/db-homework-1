package nowhere132.dbhomework1.utils;

import nowhere132.dbhomework1.models.Class;
import nowhere132.dbhomework1.models.Subject;
import nowhere132.dbhomework1.models.schedule.ClassInfo;

public class ClassInfoMapper {
    public static ClassInfo classSubjectToClassInfo(Class cl, Subject subj) {
        String[] periods = cl.getPeriodRange().trim().split("-");
        return ClassInfo.builder()
                .code(cl.getCode())
                .name(subj.getName())
                .startPeriod(Integer.valueOf(periods[0]))
                .finishPeriod(Integer.valueOf(periods[1]))
                .day(cl.getDay())
                .room(cl.getRoom())
                .threshold(cl.getStudentThreshold())
                .type(cl.getType())
                .lecturer(cl.getLecturer())
                .build();
    }
}