package com.bunker.bookingback.scheedule.infrastructure;

import com.bunker.bookingback.scheedule.application.ScheduleDto;
import com.bunker.bookingback.scheedule.application.SchedulePagedDto;
import com.bunker.bookingback.scheedule.application.create.ScheduleCreator;
import com.bunker.bookingback.scheedule.application.delete.ScheduleDeleter;
import com.bunker.bookingback.scheedule.application.reader.ScheduleReader;
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

    private final ScheduleCreator scheduleCreator;
    private final ScheduleReader scheduleReader;
    private final ScheduleDeleter scheduleDeleter;

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SchedulePagedDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @GetMapping
    ResponseEntity<SchedulePagedDto> findAll() {
        return ResponseEntity.ok(this.scheduleReader.findAll());
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ScheduleDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @PostMapping
    ResponseEntity<Void> create(@RequestBody ScheduleDto scheduleDto) {
        this.scheduleCreator.create(scheduleDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        this.scheduleDeleter.delete(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
