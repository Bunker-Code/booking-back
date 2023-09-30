package com.bunker.bookingback.scheedule.infrastructure;

import com.bunker.bookingback.scheedule.application.ScheduleDto;
import com.bunker.bookingback.scheedule.application.SchedulePagedDto;
import com.bunker.bookingback.scheedule.application.ScheduleService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
public class ScheduleApiService {

    private final ScheduleService scheduleService;

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SchedulePagedDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @GetMapping
    ResponseEntity<SchedulePagedDto> findAll() {
        return ResponseEntity.ok(this.scheduleService.findAll());
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ScheduleDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @PostMapping
    ResponseEntity<ScheduleDto> create(@RequestBody ScheduleDto scheduleDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.scheduleService.save(scheduleDto));
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        this.scheduleService.delete(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
