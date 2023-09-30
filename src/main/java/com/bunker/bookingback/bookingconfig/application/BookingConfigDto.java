package com.bunker.bookingback.bookingconfig.application;

import com.bunker.bookingback.weeklyscheedule.application.WeeklyScheduleDto;
import com.bunker.bookingback.shared.JsonDto;
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
