package nowhere132.dbhomework1.controllers;

import lombok.RequiredArgsConstructor;
import nowhere132.dbhomework1.models.schedule.Schedule;
import nowhere132.dbhomework1.services.ScheduleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ScheduleController {
    private final ScheduleService scheduleService;

    @GetMapping("/get_by_student_id")
    public Schedule getScheduleByStudentId(@RequestParam int studentId) {
        return scheduleService.getByStudentId(studentId);
    }
}
