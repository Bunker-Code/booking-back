package com.bunker.bookingback.booking.application;

import com.bunker.bookingback.booking.application.BookingDto;
import com.bunker.bookingback.booking.application.BookingSearchDto;

import java.util.List;


public interface BookingService {

    BookingDto findById(Long id);
    List<BookingDto> findAll(BookingSearchDto searchDto);
    BookingDto save(BookingDto booking);
    BookingDto update(BookingDto booking);
    void delete(Long id);

}
