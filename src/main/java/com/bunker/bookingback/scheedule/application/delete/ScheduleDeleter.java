package com.bunker.bookingback.scheedule.application.delete;

import com.bunker.bookingback.scheedule.domain.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleDeleter {

    private final ScheduleRepository scheduleRepository;

    public void delete(Long id) {
        this.scheduleRepository.deleteById(id);
    }
}
