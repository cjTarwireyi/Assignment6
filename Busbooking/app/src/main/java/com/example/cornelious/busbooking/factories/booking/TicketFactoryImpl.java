package com.example.cornelious.busbooking.factories.booking;

import com.example.cornelious.busbooking.Interfaces.ITicketFactory;
import com.example.cornelious.busbooking.domain.booking.Ticket;

/**
 * Created by Cornelious on 4/16/2016.
 */
public class TicketFactoryImpl implements ITicketFactory {
    private static TicketFactoryImpl objTicketFactory=null;
    public  TicketFactoryImpl getInstance()
    {
        if(objTicketFactory==null)
            objTicketFactory=new TicketFactoryImpl();
        return objTicketFactory;
    }
    @Override
    public Ticket createTicket(int ticketNum, String ticketType, String route, double cost) {
        Ticket objTicket = new Ticket.TicketBuilder()
                .ticketNumber(ticketNum)
                .ticketType(ticketType)
                .route(route)
                .cost(cost)
                .build();
        return objTicket;
    }
}
