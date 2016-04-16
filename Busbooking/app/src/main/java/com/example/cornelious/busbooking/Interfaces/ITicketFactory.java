package com.example.cornelious.busbooking.Interfaces;

import com.example.cornelious.busbooking.domain.booking.Ticket;

/**
 * Created by Cornelious on 4/16/2016.
 */
public interface ITicketFactory {

    Ticket createTicket(int ticketNum,String ticketType,String route,double cost);
}
