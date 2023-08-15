package com.bunker.bookingback.application.service;

import com.bunker.bookingback.application.dto.ScheduleDto;
import com.bunker.bookingback.application.dto.SchedulePagedDto;

import java.util.List;

public interface ScheduleService {

    ScheduleDto save(ScheduleDto schedule);
    void delete(Long id);
    SchedulePagedDto findAll();
}
