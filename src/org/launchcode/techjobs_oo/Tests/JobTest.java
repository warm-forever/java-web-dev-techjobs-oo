package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

//import static org.junit.Assert.assertNotEquals;

public class JobTest extends Job {

    @Test
    public void testSettingJobId() {
        Job testjob1 = new Job();
        Job testjob2 = new Job();
        assertNotEquals(testjob1, testjob2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testjob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertSame(testjob3.getName(), "Product " +
                "tester");
        assertSame("ACME", testjob3.getEmployer().getValue());
        assertSame("Desert", testjob3.getLocation().getValue());
        assertSame("Quality control", testjob3.getPositionType().getValue());
        assertSame("Persistence", testjob3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job testjob = new Job("Product tester"
                , new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testjob1 = new Job("Product tester"
                , new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(testjob, testjob1);
    }

    @Test
    public void toStringTest() {
        String expected = "ID: 7\n Name: Me\n " +
                "Employer: Dad\n Location: " +
                "Here\n Position Type: Bad\n " +
                "Core Competency: Bad Bitch";
        Job testjob = new Job("Me",
                new Employer("Dad"),
                new Location("Here"),
                new PositionType("Bad"),
                new CoreCompetency("Bad Bitch"));
        String result = Job.toString(testjob);

        assertEquals(expected, result);
    }


    @Test
    public void toStringTestWithoutProperty() {
        String expected = "ID: 5\n Name: Data " +
                "Not Available" +
                "\n " +
                "Employer: Dad\n Location: " +
                "Here\n Position Type: Bad\n " +
                "Core Competency: Bad Bitch";
        Job testjob = new Job("",
                new Employer("Dad"),
                new Location("Here"),
                new PositionType("Bad"),
                new CoreCompetency("Bad Bitch"));
        String result = Job.toString(testjob);

        assertEquals(expected, result);
    }
}
