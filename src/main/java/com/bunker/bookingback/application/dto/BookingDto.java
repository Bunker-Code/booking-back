package com.bunker.bookingback.application.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
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

    @Schema(format = "HH:mm", example = "00:00")
    @JsonFormat(pattern = "HH:mm")
    private LocalTime time;

    private Integer numPlayers;

    @Schema(example = "example name")
    private String name;

    @Schema(example = "example@gmail.com")
    private String email;

    @Schema(example = "000000000")
    private String phone;

    @Schema(type = "string")
    private String comment;
}
