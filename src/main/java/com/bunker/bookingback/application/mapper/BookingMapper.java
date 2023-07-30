package com.bunker.bookingback.application.mapper;

import com.bunker.bookingback.application.dto.BookingDto;
import com.bunker.bookingback.domain.model.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    BookingDto modelToDto(Booking booking);
    Booking dtoToModel(BookingDto bookingDto);
}
