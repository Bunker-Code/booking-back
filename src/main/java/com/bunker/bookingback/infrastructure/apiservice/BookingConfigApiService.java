package com.bunker.bookingback.infrastructure.apiservice;

import com.bunker.bookingback.application.dto.BookingConfigDto;
import com.bunker.bookingback.application.service.BookingConfigService;
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
@RequestMapping("/bookingConfig")
@RequiredArgsConstructor
public class BookingConfigApiService {

    private final BookingConfigService bookingConfigService;

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BookingConfigDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @GetMapping
    ResponseEntity<List<BookingConfigDto>> findAll() {
        return ResponseEntity.ok(this.bookingConfigService.findAll());
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BookingConfigDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @PostMapping
    ResponseEntity<BookingConfigDto> create(@RequestBody BookingConfigDto bookingConfigDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.bookingConfigService.save(bookingConfigDto));
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BookingConfigDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @PutMapping
    ResponseEntity<BookingConfigDto> update(@RequestBody BookingConfigDto bookingConfigDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.bookingConfigService.update(bookingConfigDto));
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        this.bookingConfigService.delete(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
