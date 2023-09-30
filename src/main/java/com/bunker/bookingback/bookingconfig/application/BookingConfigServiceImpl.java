package com.bunker.bookingback.bookingconfig.application;

import com.bunker.bookingback.bookingconfig.domain.BookingConfig;
import com.bunker.bookingback.bookingconfig.domain.BookingConfigRepository;
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
    public BookingConfigDto save(final BookingConfigDto bookingConfigDto) {
        final BookingConfig bookingConfigToSave = this.bookingConfigMapper.dtoToModel(bookingConfigDto);
        return this.bookingConfigMapper.modelToDto(this.bookingConfigRepository.save(bookingConfigToSave));
    }

    @Override
    public BookingConfigDto update(final BookingConfigDto bookingConfigDto) {
        if (bookingConfigDto.getId() == null || ! this.bookingConfigRepository.existsById(bookingConfigDto.getId())) {
            throw new RuntimeException("booking config dont Exist");
        }

        final BookingConfig bookingConfigToUpdate = this.bookingConfigMapper.dtoToModel(bookingConfigDto);

        return this.bookingConfigMapper.modelToDto(this.bookingConfigRepository.save(bookingConfigToUpdate));
    }

    @Override
    public void delete(final Long id) {
        this.bookingConfigRepository.deleteById(id);
    }
}
