package com.bunker.bookingback.infrastructure.apiservice;

import com.bunker.bookingback.application.dto.ScheduleDto;
import com.bunker.bookingback.application.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
public class ScheduleApiService {

    private final ScheduleService scheduleService;

    @GetMapping
    ResponseEntity<List<ScheduleDto>> findAll() {
        return ResponseEntity.ok(this.scheduleService.findAll());
    }

    @PostMapping
    ResponseEntity<ScheduleDto> create(@RequestBody ScheduleDto scheduleDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.scheduleService.save(scheduleDto));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        this.scheduleService.delete(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
