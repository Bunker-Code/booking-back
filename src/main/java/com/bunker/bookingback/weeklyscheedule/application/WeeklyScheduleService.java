package com.bunker.bookingback.weeklyscheedule.application;

import com.bunker.bookingback.weeklyscheedule.application.WeeklyScheduleDto;

import java.util.List;

public interface WeeklyScheduleService {

    List<WeeklyScheduleDto> findAll();
    WeeklyScheduleDto save(WeeklyScheduleDto weeklySchedule);
    void delete(Long id);
}
