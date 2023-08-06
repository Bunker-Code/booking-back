package com.bunker.bookingback.application.mapper;

import com.bunker.bookingback.application.dto.BookingDto;
import com.bunker.bookingback.domain.model.Booking;
import com.bunker.bunkerframework.mapper.ModelMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper extends ModelMapper<Booking, BookingDto> {
}
