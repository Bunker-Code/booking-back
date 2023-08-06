package com.bunker.bookingback.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "weekly_schedule")
public class WeeklySchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "monday_schedule_id")
    private Schedule mondaySchedule;

    @ManyToOne
    @JoinColumn(name = "tuesday_schedule_id")
    private Schedule tuesdaySchedule;

    @ManyToOne
    @JoinColumn(name = "wednesday_schedule_id")
    private Schedule wednesdaySchedule;

    @ManyToOne
    @JoinColumn(name = "thursday_schedule_id")
    private Schedule thursdaySchedule;

    @ManyToOne
    @JoinColumn(name = "friday_schedule_id")
    private Schedule fridaySchedule;

    @ManyToOne
    @JoinColumn(name = "saturday_schedule_id")
    private Schedule saturdaySchedule;

    @ManyToOne
    @JoinColumn(name = "sunday_schedule_id")
    private Schedule sundaySchedule;
}
