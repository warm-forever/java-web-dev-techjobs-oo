package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

//    Employer, Location, CoreCompetency, and PositionType
//    Vawiabuws and Constwuctuws

    public int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

//    Custom toString method

    @Override
    public String toString() {
        return value;
    }


//    Getters and Setters

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
