package com.bunker.bookingback.scheedule.application.reader;

import com.bunker.bookingback.scheedule.application.ScheduleMapper;
import com.bunker.bookingback.scheedule.application.SchedulePagedDto;
import com.bunker.bookingback.scheedule.domain.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ScheduleReader {

    private final ScheduleRepository scheduleRepository;
    private final ScheduleMapper scheduleMapper;

    public SchedulePagedDto findAll() {
        return new SchedulePagedDto(this.scheduleMapper.modelToDto(this.scheduleRepository.findAll()));
    }
}
