package com.javalife365.hoteljava.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.javalife365.hoteljava.entity.Room;
import com.javalife365.hoteljava.entity.User;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDTO {

    private String id;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private int numOfAdults;

    private int numOfChildren;

    private int totalNumberOfGuests;

    private String bookingConfirmationCode;

    private User user;

    private Room room;
}
