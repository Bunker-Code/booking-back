package com.bunker.bookingback.scheedule.application;

import com.bunker.bookingback.shared.JsonDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchedulePagedDto extends JsonDto {

    private List<ScheduleDto> data;
}

