package com.bunker.bookingback.scheedule.application.create;

import com.bunker.bookingback.scheedule.application.ScheduleDto;
import com.bunker.bookingback.scheedule.application.ScheduleMapper;
import com.bunker.bookingback.scheedule.domain.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleCreator {

    private final ScheduleRepository scheduleRepository;
    private final ScheduleMapper scheduleMapper;

    public void create(final ScheduleDto schedule) {
        scheduleRepository.save(this.scheduleMapper.dtoToModel(schedule));
    }
}
