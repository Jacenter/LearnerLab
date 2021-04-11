package tests;

import learnerlab.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test() {
        //when Students.getINSTANCE();
        //then
        Assert.assertEquals("Dawar", Students.getINSTANCE().findById(867530).getName());
        Assert.assertEquals("Juliana", Students.getINSTANCE().findById(212567).getName());
        Assert.assertEquals("Mike", Students.getINSTANCE().findById(193812).getName());
        }

    }
