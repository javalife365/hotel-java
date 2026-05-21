package com.javalife365.hoteljava.repository;

import com.javalife365.hoteljava.entity.Room;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface RoomRepository extends MongoRepository<Room, String> {

    @Aggregation("$group: { _id: '$roomType'} }") //get all room type based on their uniqueness
    List<String> findDistinctRoomType();

    @Query("{'bookings':{$size:0}}") //find rooms with no bookings
    List<Room> findAllAvailableRooms();

    List<Room> findByRoomTypeLikeAndIdNotIn(String roomType, List<String> bookedRoomIds);

}
