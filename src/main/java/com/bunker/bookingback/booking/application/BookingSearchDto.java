package com.bunker.bookingback.booking.application;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingSearchDto {

    LocalDate fromDate;
    LocalDate toDate;
}
