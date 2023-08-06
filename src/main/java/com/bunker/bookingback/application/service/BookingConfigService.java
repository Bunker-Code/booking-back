package com.bunker.bookingback.application.service;

import com.bunker.bookingback.application.dto.BookingConfigDto;

import java.util.List;

public interface BookingConfigService {

    List<BookingConfigDto> findAll();
    BookingConfigDto save(BookingConfigDto bookingConfigDto);
    BookingConfigDto update(BookingConfigDto bookingConfigDto);

    void delete(Long id);
}
