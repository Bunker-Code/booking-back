package com.bunker.bookingback.application.dto;

import com.bunker.bookingback.application.common.JsonDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeeklyScheduleDto extends JsonDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ScheduleDto mondaySchedule;
    private ScheduleDto tuesdaySchedule;
    private ScheduleDto wednesdaySchedule;
    private ScheduleDto thursdaySchedule;
    private ScheduleDto fridaySchedule;
    private ScheduleDto saturdaySchedule;
    private ScheduleDto sundaySchedule;
}
