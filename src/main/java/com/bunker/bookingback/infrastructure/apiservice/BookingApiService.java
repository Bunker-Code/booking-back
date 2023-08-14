package com.bunker.bookingback.infrastructure.apiservice;

import com.bunker.bookingback.application.dto.BookingDto;
import com.bunker.bookingback.application.service.BookingService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
@RequiredArgsConstructor
public class BookingApiService {

    private final BookingService bookingService;

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BookingDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @GetMapping("/{id}")
    ResponseEntity<BookingDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(this.bookingService.findById(id));
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BookingDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @PostMapping
    ResponseEntity<BookingDto> create(@RequestBody BookingDto booking) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.bookingService.save(booking));
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BookingDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @PutMapping
    ResponseEntity<BookingDto> update(@RequestBody BookingDto booking) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.bookingService.update(booking));
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BookingDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        this.bookingService.delete(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
