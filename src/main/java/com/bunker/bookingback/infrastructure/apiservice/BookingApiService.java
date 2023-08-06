package com.bunker.bookingback.infrastructure.apiservice;

import com.bunker.bookingback.application.dto.BookingDto;
import com.bunker.bookingback.application.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
@RequiredArgsConstructor
public class BookingApiService {

    private final BookingService bookingService;

    @GetMapping("/{id}")
    ResponseEntity<BookingDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(this.bookingService.findById(id));
    }

    @PostMapping
    ResponseEntity<BookingDto> create(@RequestBody BookingDto booking) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.bookingService.save(booking));
    }

    @PutMapping
    ResponseEntity<BookingDto> update(@RequestBody BookingDto booking) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.bookingService.update(booking));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        this.bookingService.delete(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
