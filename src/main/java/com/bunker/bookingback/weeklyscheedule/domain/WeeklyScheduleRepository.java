package com.bunker.bookingback.weeklyscheedule.domain;

import com.bunker.bookingback.weeklyscheedule.domain.WeeklySchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WeeklyScheduleRepository extends JpaRepository<WeeklySchedule, Long> , JpaSpecificationExecutor<WeeklySchedule> {
}
