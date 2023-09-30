package com.bunker.bookingback.bookingconfig.application;

import com.bunker.bookingback.weeklyscheedule.application.WeeklyScheduleMapper;
import com.bunker.bookingback.shared.ModelMapper;
import com.bunker.bookingback.bookingconfig.domain.BookingConfig;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { WeeklyScheduleMapper.class })
public interface BookingConfigMapper extends ModelMapper<BookingConfig, BookingConfigDto> {
}
