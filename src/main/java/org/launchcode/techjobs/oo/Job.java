package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job () {
        id = nextId;
        nextId++;
    }

    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency ) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    @Override
    public String toString() {
        String emptyString = "";
        String emptyFieldResponse = "Data not available";
        String id = '\n' + "ID: " + this.getId();
        String name =   "\n" +  "Name: " + this.getName();
        String employer = "\n" +  "Employer: " + this.getEmployer();
        String location = "\n" +  "Location: " + this.getLocation();
        String position = "\n" +  "Position Type: " + this.getPositionType();
        String coreCompetency = "\n" +  "Core Competency: " + this.getCoreCompetency() + '\n';

        if (id.equals('\n' + "ID: " + emptyString)) {
            id = '\n' + "ID: " + emptyFieldResponse;
        }

        if (name.equals("\n" +  "Name: " + emptyString)) {
            name = '\n' + "Name: " + emptyFieldResponse;
        }

        if (employer.equals("\n" +  "Employer: " + emptyString)) {
            employer = '\n' + "Employer: " + emptyFieldResponse;
        }

        if (location.equals("\n" +  "Location: " + emptyString)) {
            location = '\n' + "Location: " + emptyFieldResponse;
        }

        if (position.equals("\n" +  "Position Type: " + emptyString)) {
            position = '\n' + "Position Type: " + emptyFieldResponse;
        }

        if (coreCompetency.equals("\n" +  "Core Competency: " + emptyString + '\n')) {
            coreCompetency = '\n' + "Core Competency: " + emptyFieldResponse;
        }

        return id + name + employer + location + position + coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
