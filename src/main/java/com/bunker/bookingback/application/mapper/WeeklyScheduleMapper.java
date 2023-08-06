package com.bunker.bookingback.application.mapper;

import com.bunker.bookingback.application.dto.WeeklyScheduleDto;
import com.bunker.bookingback.domain.model.WeeklySchedule;
import com.bunker.bunkerframework.mapper.ModelMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WeeklyScheduleMapper extends ModelMapper<WeeklySchedule, WeeklyScheduleDto> {
}
