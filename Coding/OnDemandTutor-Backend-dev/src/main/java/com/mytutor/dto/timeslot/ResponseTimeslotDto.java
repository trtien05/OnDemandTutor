package com.mytutor.dto.timeslot;

import lombok.Data;

import java.sql.Time;
import java.time.LocalDate;

/**
 * @author vothimaihoa
 *
 */
@Data
public class ResponseTimeslotDto {
    
    private int id;

    private Integer accountId;

    private Time startTime;

    private Time endTime;

    private Integer dayOfWeek;

    private LocalDate scheduleDate;

    private boolean isOccupied;

    private Integer appointmentId;
}
