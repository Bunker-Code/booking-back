package com.bunker.bookingback.bookingconfig.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingConfigRepository extends JpaRepository<BookingConfig, Long>, JpaSpecificationExecutor<BookingConfig> {
}
