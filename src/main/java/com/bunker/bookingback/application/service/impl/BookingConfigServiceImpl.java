package com.bunker.bookingback.application.service.impl;

import com.bunker.bookingback.application.dto.BookingConfigDto;
import com.bunker.bookingback.application.mapper.BookingConfigMapper;
import com.bunker.bookingback.application.service.BookingConfigService;
import com.bunker.bookingback.domain.model.BookingConfig;
import com.bunker.bookingback.domain.repository.BookingConfigRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingConfigServiceImpl implements BookingConfigService {

    private final BookingConfigRepository bookingConfigRepository;
    private final BookingConfigMapper bookingConfigMapper;

    @Override
    public List<BookingConfigDto> findAll() {
        return this.bookingConfigMapper.modelToDto(this.bookingConfigRepository.findAll());
    }

    @Override
    public BookingConfigDto save(BookingConfigDto bookingConfigDto) {
        final BookingConfig bookingConfigToSave = this.bookingConfigMapper.dtoToModel(bookingConfigDto);
        return this.bookingConfigMapper.modelToDto(this.bookingConfigRepository.save(bookingConfigToSave));
    }

    @Override
    public BookingConfigDto update(BookingConfigDto bookingConfigDto) {
        if(bookingConfigDto.getId() == null || !this.bookingConfigRepository.existsById(bookingConfigDto.getId())) {
            throw new RuntimeException("booking config dont Exist");
        }
        final BookingConfig bookingConfigToUpdate = this.bookingConfigMapper.dtoToModel(bookingConfigDto);

        return this.bookingConfigMapper.modelToDto(this.bookingConfigRepository.save(bookingConfigToUpdate));
    }

    @Override
    public void delete(Long id) {
        this.bookingConfigRepository.deleteById(id);
    }
}
