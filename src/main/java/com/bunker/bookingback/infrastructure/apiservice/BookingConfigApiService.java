package com.bunker.bookingback.infrastructure.apiservice;

import com.bunker.bookingback.application.dto.BookingConfigDto;
import com.bunker.bookingback.application.service.BookingConfigService;
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

    @GetMapping
    ResponseEntity<List<BookingConfigDto>> findAll() {
        return ResponseEntity.ok(this.bookingConfigService.findAll());
    }

    @PostMapping
    ResponseEntity<BookingConfigDto> create(@RequestBody BookingConfigDto bookingConfigDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.bookingConfigService.save(bookingConfigDto));
    }

    @PutMapping
    ResponseEntity<BookingConfigDto> update(@RequestBody BookingConfigDto bookingConfigDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.bookingConfigService.update(bookingConfigDto));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        this.bookingConfigService.delete(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
