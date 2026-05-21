package com.javalife365.hoteljava.dto;

import com.javalife365.hoteljava.entity.Booking;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String role;
    private String email;
    private String password;
    private List<Booking> bookings = new ArrayList<>();
}
