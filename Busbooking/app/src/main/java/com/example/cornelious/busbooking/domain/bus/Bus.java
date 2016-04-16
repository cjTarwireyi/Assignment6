package com.example.cornelious.busbooking.domain.bus;

/**
 * Created by Cornelious on 4/16/2016.
 */
public class Bus {

    private String numberPlate;
    private int numberOfSeats;


    public  Bus(BusBuilder objBusBuilder)
    {
        this.numberPlate=objBusBuilder.numberPlate;
        this.numberOfSeats=objBusBuilder.numberOfseats;

    }
     public String getNumberPlate() {
        return numberPlate;
    }

    public int getSeats() {
        return numberOfSeats;
    }
    public static class BusBuilder
    {
        private String numberPlate;
        private int numberOfseats;

        public BusBuilder getnumberPlate(String numberPlate)
        {
            this.numberPlate=numberPlate;
            return this;
        }
        public BusBuilder seats(int numberOfSeats)
        {
            this.numberOfseats=numberOfSeats;
            return this;
        }

        public BusBuilder copy(Bus objBus)
        {
            this.numberPlate=objBus.numberPlate;
            this.numberOfseats=objBus.numberOfSeats;
            return this;
        }
        public  Bus build()
        {
            return new Bus (this);
        }


    }
}
