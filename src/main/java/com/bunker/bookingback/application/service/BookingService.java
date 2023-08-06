package com.bunker.bookingback.application.service;

import com.bunker.bookingback.application.dto.BookingDto;
import com.bunker.bookingback.application.dto.BookingSearchDto;

import java.util.List;


public interface BookingService {

    BookingDto findById(Long id);
    List<BookingDto> findAll(BookingSearchDto searchDto);
    BookingDto save(BookingDto booking);
    BookingDto update(BookingDto booking);
    void delete(Long id);

}
