package org.sda.model;

/**
 * Enum exercise
 *1. Create enum Planets.
 * a) Override toString method. It should print relative size of a planet and it’s name.
 * E.g. „Huge Jupiter”, „Small Pluto”.
 * b) Create distanceFromEarth method.
 * c) Verify both methods for multiple planets
 */

public enum Planets {
    MARS(2500000, "Red Mars"),
    EARTH(300000, "my Earth"),
    JUPITER(40000000, "Huge Jupiter"),
    SATURN(35000000, "Ring Saturn"),
    PLUTO(1000000, "Small Pluto"),
    VENUS(1500000, "Evening star Venus");

    private float relativeSize;
    private String name;

    Planets(float relativeSize, String name) {
        this.relativeSize = relativeSize;
        this.name = name;
    }

    public void setRelativeSize(float relativeSize) {
        this.relativeSize = relativeSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "relativeSize=" + relativeSize +
                ", name='" + name + '\'' +
                '}';
    }

    public double distanceFromEarth() {
        return EARTH.relativeSize - this.relativeSize;

    }
}
