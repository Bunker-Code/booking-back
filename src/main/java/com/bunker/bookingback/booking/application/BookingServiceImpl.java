package com.bunker.bookingback.booking.application;

import com.bunker.bookingback.shared.JpaSpecs;
import com.bunker.bookingback.booking.application.BookingDto;
import com.bunker.bookingback.booking.application.BookingSearchDto;
import com.bunker.bookingback.booking.application.BookingMapper;
import com.bunker.bookingback.booking.application.BookingService;
import com.bunker.bookingback.booking.domain.Booking;
import com.bunker.bookingback.booking.domain.BookingRepository;

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
    public BookingDto findById(final Long id) {
        return this.bookingMapper.modelToDto(this.bookingRepository.findById(id).orElseThrow());
    }

    @Override
    public BookingDto save(final BookingDto booking) {
        final Booking bookingToSave = this.bookingMapper.dtoToModel(booking);
        return this.bookingMapper.modelToDto(this.bookingRepository.save(bookingToSave));
    }

    @Override
    public BookingDto update(final BookingDto booking) {
        if(booking == null || booking.getId() == null || !this.bookingRepository.existsById(booking.getId())) {
            throw new RuntimeException("booking dont Exist");
        }
        final Booking bookingToUpdate = this.bookingMapper.dtoToModel(booking);

        return this.bookingMapper.modelToDto(this.bookingRepository.save(bookingToUpdate));
    }

    @Override
    public List<BookingDto> findAll(final BookingSearchDto searchDto) {
        final Specification<Booking> specs = this.buildSpecs(searchDto);
        final List<Booking> bookings = this.bookingRepository.findAll(specs);

        return this.bookingMapper.modelToDto(bookings);
    }

    @Override
    public void delete(Long id) {
        this.bookingRepository.deleteById(id);
    }

    private Specification<Booking> buildSpecs(final BookingSearchDto searchDto) {
        return JpaSpecs.<Booking>dateGreaterThanOrEqualTo("date", searchDto.getFromDate())
                .and(JpaSpecs.dateLessThanOrEqualTo("date", searchDto.getToDate()));
    }

}
