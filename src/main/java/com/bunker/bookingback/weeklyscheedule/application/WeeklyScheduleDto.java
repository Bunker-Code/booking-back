package com.bunker.bookingback.weeklyscheedule.application;

import com.bunker.bookingback.scheedule.application.ScheduleDto;
import com.bunker.bookingback.shared.JsonDto;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
