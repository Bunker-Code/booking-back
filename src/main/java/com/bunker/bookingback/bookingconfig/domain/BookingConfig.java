package com.bunker.bookingback.bookingconfig.domain;

import com.bunker.bookingback.weeklyscheedule.domain.WeeklySchedule;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "booking_config")
public class BookingConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "game_id")
    private Long gameId;

    @ManyToOne
    @JoinColumn(name = "weekly_schedule_id")
    private WeeklySchedule weeklySchedule;
}
