package com.bunker.bookingback.scheedule.domain;

import java.util.List;

public interface ScheduleRepository  {

    void save(Schedule schedule);

    void deleteById(Long id);

    List<Schedule> findAll();
}
