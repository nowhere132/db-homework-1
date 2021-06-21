package nowhere132.dbhomework1.services;

import nowhere132.dbhomework1.entities.schedule.Schedule;

public interface ScheduleService {
    Schedule getByStudentId(int studentId);
}
