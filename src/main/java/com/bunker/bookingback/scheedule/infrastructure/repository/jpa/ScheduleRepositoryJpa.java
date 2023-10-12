package com.bunker.bookingback.scheedule.infrastructure.repository.jpa;

import com.bunker.bookingback.scheedule.domain.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ScheduleRepositoryJpa extends JpaRepository<Schedule, Long>, JpaSpecificationExecutor<Schedule> {

}
