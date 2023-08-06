package com.bunker.bookingback.application.dto;

import com.bunker.bookingback.domain.model.WeeklySchedule;
import com.bunker.bunkerframework.dto.JsonDto;
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
    private WeeklySchedule weeklySchedule;
}
