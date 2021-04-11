package tests;

import learnerlab.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testInstructors() {
        //when Instructors.getInstanceOfInstructors();
        //then
        Assert.assertEquals("Mikaila", Instructors.getInstanceOfInstructors().findById(125698).getName());
        Assert.assertEquals("Leon", Instructors.getInstanceOfInstructors().findById(287626).getName());
    }
}
