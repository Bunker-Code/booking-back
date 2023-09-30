package com.bunker.bookingback.scheedule.application;

import com.bunker.bookingback.scheedule.application.ScheduleDto;
import com.bunker.bookingback.scheedule.application.SchedulePagedDto;

public interface ScheduleService {

    ScheduleDto save(ScheduleDto schedule);
    void delete(Long id);
    SchedulePagedDto findAll();
}
