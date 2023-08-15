package com.bunker.bookingback.application.dto;

import com.bunker.bookingback.application.common.JsonDto;
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

    List<ScheduleDto> data;
}
