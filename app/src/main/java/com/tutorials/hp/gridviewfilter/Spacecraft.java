package com.tutorials.hp.gridviewfilter;

/**
 * Created by Oclemy for ProgrammingWizards TV Channel and http://www.camposha.info.
 - Our Spacecraft class.
 - Our data object.
 - The spacecraft will have three properties: name,propellant and destination.
 - The values for these are passed to us via constructor, and we have corresponding getter methods to retrieve them.
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
