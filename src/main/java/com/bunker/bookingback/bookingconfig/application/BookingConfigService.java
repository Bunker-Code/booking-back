package com.bunker.bookingback.bookingconfig.application;


import java.util.List;

public interface BookingConfigService {

    List<BookingConfigDto> findAll();
    BookingConfigDto save(BookingConfigDto bookingConfigDto);
    BookingConfigDto update(BookingConfigDto bookingConfigDto);

    void delete(Long id);
}