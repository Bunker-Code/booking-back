package com.bunker.bookingback.weeklyscheedule.application;

import com.bunker.bookingback.weeklyscheedule.domain.WeeklySchedule;
import com.bunker.bookingback.weeklyscheedule.domain.WeeklyScheduleRepository;
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
    public WeeklyScheduleDto save(final WeeklyScheduleDto weeklySchedule) {
        final WeeklySchedule weeklyScheduleSaved = this.weeklyScheduleRepository.save(
                this.weeklyScheduleMapper.dtoToModel(weeklySchedule));
        return this.weeklyScheduleMapper.modelToDto(weeklyScheduleSaved);
    }

    @Override
    public void delete(final Long id) {
        this.weeklyScheduleRepository.deleteById(id);
    }
}
