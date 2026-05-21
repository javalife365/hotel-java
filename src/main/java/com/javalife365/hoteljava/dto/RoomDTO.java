package com.javalife365.hoteljava.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.javalife365.hoteljava.entity.Booking;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomDTO {

    private String id;

    private String roomType;

    private BigDecimal roomPrice;

    private String roomImageUrl;

    private String roomDescription;

    private List<Booking> bookings;


}
