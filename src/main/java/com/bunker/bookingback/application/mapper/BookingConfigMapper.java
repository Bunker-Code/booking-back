package com.bunker.bookingback.application.mapper;

import com.bunker.bookingback.application.dto.BookingConfigDto;
import com.bunker.bookingback.domain.model.BookingConfig;
import com.bunker.bunkerframework.mapper.ModelMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { WeeklyScheduleMapper.class })
public interface BookingConfigMapper extends ModelMapper<BookingConfig, BookingConfigDto> {
}
