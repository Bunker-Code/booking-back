package com.bunker.bookingback.scheedule.application;

import com.bunker.bookingback.scheedule.application.ScheduleDto;
import com.bunker.bookingback.scheedule.application.SchedulePagedDto;
import com.bunker.bookingback.scheedule.application.ScheduleMapper;
import com.bunker.bookingback.scheedule.application.ScheduleService;
import com.bunker.bookingback.scheedule.domain.Schedule;
import com.bunker.bookingback.scheedule.domain.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;
    private final ScheduleMapper scheduleMapper;

    @Override
    public ScheduleDto save(ScheduleDto schedule) {
        final Schedule scheduleSaved = this.scheduleRepository.save(this.scheduleMapper.dtoToModel(schedule));
        return this.scheduleMapper.modelToDto(scheduleSaved);
    }

    @Override
    public void delete(Long id) {
        this.scheduleRepository.deleteById(id);
    }

    @Override
    public SchedulePagedDto findAll() {
        return new SchedulePagedDto(this.scheduleMapper.modelToDto(this.scheduleRepository.findAll()));
    }
}
