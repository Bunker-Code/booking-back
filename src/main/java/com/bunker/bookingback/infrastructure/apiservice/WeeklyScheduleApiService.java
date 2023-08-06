package com.bunker.bookingback.infrastructure.apiservice;

import com.bunker.bookingback.application.dto.WeeklyScheduleDto;
import com.bunker.bookingback.application.service.WeeklyScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weeklyschedule")
@RequiredArgsConstructor
public class WeeklyScheduleApiService {

    private final WeeklyScheduleService weeklyScheduleService;

    @GetMapping
    ResponseEntity<List<WeeklyScheduleDto>> findAll() {
        return ResponseEntity.ok(this.weeklyScheduleService.findAll());
    }

    @PostMapping
    ResponseEntity<WeeklyScheduleDto> create(@RequestBody WeeklyScheduleDto weeklyScheduleDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.weeklyScheduleService.save(weeklyScheduleDto));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        this.weeklyScheduleService.delete(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
