package com.bunker.bookingback.booking.infrastructure;

import com.bunker.bookingback.booking.application.BookingDto;
import com.bunker.bookingback.booking.application.BookingService;
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
    public ResponseEntity<BookingDto> findById(@PathVariable final Long id) {
        return ResponseEntity.ok(this.bookingService.findById(id));
    }


    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BookingDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @PostMapping
    public ResponseEntity<BookingDto> create(@RequestBody final BookingDto booking) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.bookingService.save(booking));
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BookingDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @PutMapping
    public ResponseEntity<BookingDto> update(@RequestBody final BookingDto booking) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.bookingService.update(booking));
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BookingDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not found"),
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final Long id) {
        this.bookingService.delete(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
