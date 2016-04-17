package com.example.cornelious.busbooking.domain.bus;

/**
 * Created by Cornelious on 4/17/2016.
 */
public class Maintainance {
    private String maintainanceCode;
    private    String description;
    private double  cost;

     private Maintainance(BuildMaintainance objBuilder)
    {
        this.description=objBuilder.description;
        this.cost=objBuilder.cost;
        this.maintainanceCode=objBuilder.maintainanceCode;
    }

    public String getMaintainanceCode() {
        return maintainanceCode;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
    public static class BuildMaintainance
    {
        private String maintainanceCode;
        private    String description;
        private double  cost;
        public BuildMaintainance(){}

        public BuildMaintainance code(String code)
        {
            maintainanceCode=code;
            return this;
        }

        public BuildMaintainance Description(String description)
        {
            this.description=description;
            return this;
        }
        public BuildMaintainance cost  (double cost)
        {
            this.cost=cost;
            return this;
        }

        public Maintainance build()
        {
            return new Maintainance( this);
        }
        public BuildMaintainance copy(Maintainance objMaintainance)
        {
           this.maintainanceCode=objMaintainance.maintainanceCode;
            this.description=objMaintainance.description;
            this.cost=objMaintainance.cost;
            return this;

        }
    }
}
