package com.bunker.bookingback.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {

    private Long id;
    private LocalDate date;
    private LocalTime time;
    private Integer numPlayers;
    private String name;
    private String email;
    private String phone;
    private String comment;
}
