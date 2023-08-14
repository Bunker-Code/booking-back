package com.bunker.bookingback.infrastructure.apiservice;

import com.bunker.bookingback.application.dto.WeeklyScheduleDto;
import com.bunker.bookingback.application.service.WeeklyScheduleService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = WeeklyScheduleDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @GetMapping()
    ResponseEntity<List<WeeklyScheduleDto>> findAll() {
        return ResponseEntity.ok(this.weeklyScheduleService.findAll());
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = WeeklyScheduleDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @PostMapping
    ResponseEntity<WeeklyScheduleDto> create(@RequestBody WeeklyScheduleDto weeklyScheduleDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.weeklyScheduleService.save(weeklyScheduleDto));
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        this.weeklyScheduleService.delete(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
