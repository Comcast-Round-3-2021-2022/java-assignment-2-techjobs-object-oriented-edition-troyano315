package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(),job2.getId());
    }

    @Test public void testJobConstructorSetsAllFields() {
        Job constructorTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(constructorTest.getName() instanceof String);
        assertTrue(constructorTest.getEmployer() instanceof Employer);
        assertTrue(constructorTest.getLocation() instanceof Location);
        assertTrue(constructorTest.getPositionType() instanceof PositionType);
        assertTrue(constructorTest.getCoreCompetency() instanceof CoreCompetency);


        assertEquals(constructorTest.getName(), "Product tester");
        assertEquals(constructorTest.getEmployer().getValue(), "ACME");
        assertEquals(constructorTest.getLocation().getValue(), "Desert");
        assertEquals(constructorTest.getPositionType().getValue(), "Quality control");
        assertEquals(constructorTest.getCoreCompetency().getValue(), "Persistence");

    }

    @Test
    public void testJobsForEquality() {

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String job1ToString = job1.toString();

        assertEquals(job1ToString.charAt(0),'\n');
        assertEquals(job1ToString.charAt(job1ToString.length() - 1),'\n');

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobString = '\n' + "ID: " + job1.getId() + "\n" +  "Name: " + job1.getName() + "\n" +  "Employer: " + job1.getEmployer() + "\n" +  "Location: " + job1.getLocation() + "\n" +  "Position Type: " + job1.getPositionType() + "\n" +  "Core Competency: " + job1.getCoreCompetency() + '\n';

        assertEquals(job1.toString(), jobString);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        String emptyFieldString = "Data not available";
        Job job1 = new Job(emptyFieldString, new Employer(emptyFieldString), new Location(emptyFieldString), new PositionType(emptyFieldString), new CoreCompetency(emptyFieldString));

        String jobString = '\n' + "ID: " + job1.getId() + "\n" +  "Name: " + job1.getName() + "\n" +  "Employer: " + job1.getEmployer() + "\n" +  "Location: " + job1.getLocation() + "\n" +  "Position Type: " + job1.getPositionType() + "\n" +  "Core Competency: " + job1.getCoreCompetency() + '\n';

        assertEquals(job1.toString(), jobString);
    }
}
