package com.bunker.bookingback.application.service;

import com.bunker.bookingback.application.dto.BookingDto;
import com.bunker.bookingback.application.dto.BookingSearchDto;

import java.util.List;


public interface BookingService {

    BookingDto findById(Long id);
    BookingDto save(BookingDto booking);
    BookingDto update(Long id, BookingDto booking);

    List<BookingDto> findAll(BookingSearchDto searchDto);
    void delete(Long id);

}
