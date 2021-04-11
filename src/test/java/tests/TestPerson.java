package tests;

import learnerlab.Person;
import learnerlab.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        //given
        String expectedName = Students.getINSTANCE().findById(212567).getName();
        Long expectedId = Students.getINSTANCE().findById(212567).getId();
        Person person = new Person(expectedName, expectedId);
        //when
        String actualName = person.getName();
        Long actualId = person.getId();
        //then
        Assert.assertEquals(expectedName + expectedId, actualName + actualId);
    }

    @Test
    public void testSetName() {
        //given
        String expectedName = "Bob";
        Long expectedId = Long.valueOf(01234567);
        Person person = new Person(expectedName,expectedId);
        //when
        person.setName(expectedName);
        String actualName = person.getName();
        //then
        Assert.assertEquals(expectedName,actualName);
    }
}