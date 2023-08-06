package com.bunker.bookingback.domain.repository;

import com.bunker.bookingback.domain.model.BookingConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingConfigRepository extends JpaRepository<BookingConfig, Long>, JpaSpecificationExecutor<BookingConfig> {
}
