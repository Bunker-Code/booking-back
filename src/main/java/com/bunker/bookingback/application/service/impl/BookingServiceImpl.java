package com.bunker.bookingback.application.service.impl;

import com.bunker.bookingback.application.dto.BookingDto;
import com.bunker.bookingback.application.dto.BookingSearchDto;
import com.bunker.bookingback.application.mapper.BookingMapper;
import com.bunker.bookingback.application.service.BookingService;
import com.bunker.bookingback.domain.model.Booking;
import com.bunker.bookingback.domain.repository.BookingRepository;
import com.bunker.bunkerframework.jpa.specs.JpaSpecs;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

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
        final Booking bookingToSave = this.bookingMapper.dtoToModel(booking);
        return this.bookingMapper.modelToDto(this.bookingRepository.save(bookingToSave));
    }

    @Override
    public BookingDto update(BookingDto booking) {
        if(booking.getId() == null || !this.bookingRepository.existsById(booking.getId())) {
            throw new RuntimeException("booking dont Exist");
        }
        final Booking bookingToUpdate = this.bookingMapper.dtoToModel(booking);

        return this.bookingMapper.modelToDto(this.bookingRepository.save(bookingToUpdate));
    }

    @Override
    public List<BookingDto> findAll(BookingSearchDto searchDto) {
        Specification<Booking> specs = this.buildSpecs(searchDto);
        List<Booking> bookings = this.bookingRepository.findAll(specs);

        return this.bookingMapper.modelToDto(bookings);
    }

    @Override
    public void delete(Long id) {
        this.bookingRepository.deleteById(id);
    }

    private Specification<Booking> buildSpecs(BookingSearchDto searchDto) {
        return JpaSpecs.<Booking>dateGreaterThanOrEqualTo("date", searchDto.getFromDate())
                .and(JpaSpecs.dateLessThanOrEqualTo("date", searchDto.getToDate()));
    }

}
