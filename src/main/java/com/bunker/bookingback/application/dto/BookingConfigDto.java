package com.bunker.bookingback.application.dto;

import com.bunker.bookingback.application.common.JsonDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingConfigDto extends JsonDto {

    private Long id;
    private Long gameId;
    private WeeklyScheduleDto weeklySchedule;
}
