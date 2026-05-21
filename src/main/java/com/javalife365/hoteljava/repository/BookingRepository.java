package com.javalife365.hoteljava.repository;

import com.javalife365.hoteljava.entity.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BookingRepository extends MongoRepository<Booking, String> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);


    //checkInDate is less than or equal to chekOutDate and checkOutDate is greater then and equal to checkInDate
    @Query("{'checkInDate': {$lte: ?1}, 'checkOutDate': {$gte: ?0}}")
    List<Booking> findBookingsByDateRange(LocalDate checkInDate, LocalDate checkOutDate);





}
