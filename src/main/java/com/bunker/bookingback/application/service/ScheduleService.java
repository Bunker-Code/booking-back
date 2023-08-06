package com.bunker.bookingback.application.service;

import com.bunker.bookingback.application.dto.BookingDto;
import com.bunker.bookingback.domain.model.Schedule;

import java.util.List;

public interface ScheduleService {

    Schedule save(BookingDto booking);
    void delete(Long id);
    List<Schedule> findAll();
}
