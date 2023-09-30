package com.bunker.bookingback.weeklyscheedule.application;

import com.bunker.bookingback.weeklyscheedule.application.WeeklyScheduleDto;
import com.bunker.bookingback.scheedule.application.ScheduleMapper;
import com.bunker.bookingback.weeklyscheedule.domain.WeeklySchedule;
import com.bunker.bookingback.shared.ModelMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { ScheduleMapper.class })
public interface WeeklyScheduleMapper extends ModelMapper<WeeklySchedule, WeeklyScheduleDto> {
}
