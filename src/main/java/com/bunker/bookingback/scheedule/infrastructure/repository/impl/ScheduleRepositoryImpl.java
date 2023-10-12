package com.bunker.bookingback.scheedule.infrastructure.repository.impl;

import com.bunker.bookingback.scheedule.domain.Schedule;
import com.bunker.bookingback.scheedule.domain.ScheduleRepository;
import com.bunker.bookingback.scheedule.infrastructure.repository.jpa.ScheduleRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class ScheduleRepositoryImpl implements ScheduleRepository {

    private final ScheduleRepositoryJpa scheduleRepositoryJpa;

    @Override
    public void save(Schedule schedule) {
        this.scheduleRepositoryJpa.save(schedule);
    }

    @Override
    public void deleteById(Long id) {
        this.scheduleRepositoryJpa.deleteById(id);
    }

    @Override
    public List<Schedule> findAll() {
        return this.scheduleRepositoryJpa.findAll();
    }
}
