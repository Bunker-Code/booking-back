package com.bunker.bookingback.scheedule.application;

import com.bunker.bookingback.scheedule.application.ScheduleDto;
import com.bunker.bookingback.scheedule.domain.Schedule;
import com.bunker.bookingback.shared.ModelMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ScheduleMapper extends ModelMapper<Schedule, ScheduleDto> {
}
