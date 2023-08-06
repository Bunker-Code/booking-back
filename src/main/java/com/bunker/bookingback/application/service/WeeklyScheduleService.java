package com.bunker.bookingback.application.service;

import com.bunker.bookingback.application.dto.WeeklyScheduleDto;

import java.util.List;

public interface WeeklyScheduleService {

    List<WeeklyScheduleDto> findAll();
    WeeklyScheduleDto save(WeeklyScheduleDto weeklySchedule);
    void delete(Long id);
}
