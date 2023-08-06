package com.bunker.bookingback.application.mapper;

import com.bunker.bookingback.application.dto.ScheduleDto;
import com.bunker.bookingback.domain.model.Schedule;
import com.bunker.bunkerframework.mapper.ModelMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ScheduleMapper extends ModelMapper<Schedule, ScheduleDto> {
}
