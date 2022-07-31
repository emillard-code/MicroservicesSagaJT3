package com.project.event;

import com.project.dto.OrderRequestDTO;

import java.util.Date;
import java.util.UUID;

public class OrderEvent {

    private UUID eventId=UUID.randomUUID();
    private Date eventDate=new Date();
    private OrderRequestDTO orderRequestDto;
    private OrderStatus orderStatus;

}
