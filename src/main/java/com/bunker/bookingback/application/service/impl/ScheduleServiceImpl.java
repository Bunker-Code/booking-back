package com.bunker.bookingback.application.service.impl;

import com.bunker.bookingback.application.dto.ScheduleDto;
import com.bunker.bookingback.application.mapper.ScheduleMapper;
import com.bunker.bookingback.application.service.ScheduleService;
import com.bunker.bookingback.domain.model.Schedule;
import com.bunker.bookingback.domain.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public List<ScheduleDto> findAll() {
        return this.scheduleMapper.modelToDto(this.scheduleRepository.findAll());
    }
}
