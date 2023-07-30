package com.bunker.bookingback.application.service;

import com.bunker.bookingback.application.dto.BookingDto;


public interface BookingService {

    BookingDto findById(Long id);
    BookingDto save(BookingDto booking);
    BookingDto update(Long id, BookingDto booking);
    void delete(Long id);

}
