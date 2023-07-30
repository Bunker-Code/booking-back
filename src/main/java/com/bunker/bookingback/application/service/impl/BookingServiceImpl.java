package com.bunker.bookingback.application.service.impl;

import com.bunker.bookingback.application.dto.BookingDto;
import com.bunker.bookingback.application.mapper.BookingMapper;
import com.bunker.bookingback.application.service.BookingService;
import com.bunker.bookingback.domain.model.Booking;
import com.bunker.bookingback.domain.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    @Override
    public BookingDto findById(Long id) {
        return this.bookingMapper.modelToDto(this.bookingRepository.findById(id).orElseThrow());
    }

    @Override
    public BookingDto save(BookingDto booking) {
        Booking bookingToSave = this.bookingMapper.dtoToModel(booking);
        return this.bookingMapper.modelToDto(this.bookingRepository.save(bookingToSave));
    }

    @Override
    public BookingDto update(Long id, BookingDto booking) {
        if(!booking.getId().equals(id)) {
            throw new RuntimeException();
        }
        if(!this.bookingRepository.existsById(id)) {
            throw new RuntimeException("booking dont Exist");
        }
        Booking bookingToUpdate = this.bookingMapper.dtoToModel(booking);

        return this.bookingMapper.modelToDto(this.bookingRepository.save(bookingToUpdate));
    }

    @Override
    public void delete(Long id) {
        this.bookingRepository.deleteById(id);
    }

}
