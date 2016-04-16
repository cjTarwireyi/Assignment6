package com.example.cornelious.busbooking.domain.passenger;

/**
 * Created by Cornelious on 4/16/2016.
 */
public class Passenger {
    private String idNumber;
    private String name;
    private String lastName;

    private Passenger(PassengerBuilder objBuilder)
    {
        this.idNumber = objBuilder.idNumber;
        this.name=objBuilder.name;
        this.lastName=objBuilder.lastName;
    }


    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    public static class PassengerBuilder
    {
        private String idNumber;
        private String name;
        private String lastName;

        public PassengerBuilder id(String idNumber)
        {
            this.idNumber=idNumber;
            return this;
        }
        public PassengerBuilder name(String name)
        {
            this.name=name;
            return this;
        }
        public PassengerBuilder lastName(String lastName)
        {
            this.lastName=lastName;
            return this;
        }
        public PassengerBuilder copy(Passenger objPassenger)
        {
            this.idNumber=objPassenger.idNumber;
            this.name=objPassenger.name;
            this.lastName=objPassenger.lastName;
            return  this;
        }
        public  Passenger build()
        {
            return new Passenger(this);
        }


    }
}
