package com.bunker.bookingback.domain.repository;

import com.bunker.bookingback.domain.model.WeeklySchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WeeklyRepository extends JpaRepository<WeeklySchedule, Long> , JpaSpecificationExecutor<WeeklySchedule> {
}
