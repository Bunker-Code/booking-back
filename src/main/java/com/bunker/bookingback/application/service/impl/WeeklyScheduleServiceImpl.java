package com.bunker.bookingback.application.service.impl;

import com.bunker.bookingback.application.dto.WeeklyScheduleDto;
import com.bunker.bookingback.application.mapper.WeeklyScheduleMapper;
import com.bunker.bookingback.application.service.WeeklyScheduleService;
import com.bunker.bookingback.domain.model.WeeklySchedule;
import com.bunker.bookingback.domain.repository.WeeklyScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WeeklyScheduleServiceImpl implements WeeklyScheduleService {

    private final WeeklyScheduleRepository weeklyScheduleRepository;
    private final WeeklyScheduleMapper weeklyScheduleMapper;

    @Override
    public List<WeeklyScheduleDto> findAll() {
        return this.weeklyScheduleMapper.modelToDto(this.weeklyScheduleRepository.findAll());
    }

    @Override
    public WeeklyScheduleDto save(WeeklyScheduleDto weeklySchedule) {
        final WeeklySchedule weeklyScheduleSaved = this.weeklyScheduleRepository.save(
                this.weeklyScheduleMapper.dtoToModel(weeklySchedule));
        return this.weeklyScheduleMapper.modelToDto(weeklyScheduleSaved);
    }

    @Override
    public void delete(Long id) {
        this.weeklyScheduleRepository.deleteById(id);
    }
}
