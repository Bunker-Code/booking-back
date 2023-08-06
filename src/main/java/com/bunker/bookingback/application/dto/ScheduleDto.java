package com.bunker.bookingback.application.dto;

import com.bunker.bunkerframework.dto.JsonDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDto extends JsonDto {


    private Long id;

    private String name;

    @Schema(format = "HH:mm")
    @JsonFormat(pattern = "HH:mm")
    private Set<LocalTime> hours;
}
