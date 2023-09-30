package com.bunker.bookingback.booking.application;

import com.bunker.bookingback.booking.domain.Booking;
import com.bunker.bookingback.shared.ModelMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper extends ModelMapper<Booking, BookingDto> {
}
