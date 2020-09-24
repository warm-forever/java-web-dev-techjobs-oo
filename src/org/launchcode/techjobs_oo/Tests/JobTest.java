package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

public class JobTest extends Job {

    @Before
    public void createJobObject() {
        Job testjob1 = new Job();
        Job testjob2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        //ok so right here i'm confused on how
        // to set up the unit tests. iirc i
        // need to use assertEquals,
        // assertTrue, or assertFalse to
        // make sure two objects don't have the
        // same id number and that the id
        // number differs by 1. -m
    }

}
