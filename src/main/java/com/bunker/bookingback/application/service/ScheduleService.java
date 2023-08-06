package com.bunker.bookingback.application.service;

import com.bunker.bookingback.application.dto.ScheduleDto;

import java.util.List;

public interface ScheduleService {

    ScheduleDto save(ScheduleDto schedule);
    void delete(Long id);
    List<ScheduleDto> findAll();
}
