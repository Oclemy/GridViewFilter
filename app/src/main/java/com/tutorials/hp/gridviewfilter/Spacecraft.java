package com.tutorials.hp.gridviewfilter;

/**
 * Created by Oclemy on 9/11/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class Spacecraft {
    String name,propellant,destination;

    public Spacecraft(String name, String propellant, String destination) {
        this.name = name;
        this.propellant = propellant;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public String getPropellant() {
        return propellant;
    }

    public String getDestination() {
        return destination;
    }


}
