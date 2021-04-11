package tests;

import learnerlab.Student;
import learnerlab.Students;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {
    
    private Students students;
    private Student student;

    @Before
    public void setVariables() throws Exception{
       this.students = Students.getINSTANCE();
       this.student = new Student("Joe", 123456);
       
    }

    @Test
    public void testAdd() {
        //when
        students.add(student);
        //then
        Assert.assertEquals(students.findById(123456), student);
    }

    @Test
    public void testFindById() {
        //given
        Student student1 = new Student("Jon", 234567);
        //when
        students.add(student1);
        Student expected = students.findById(234567);
        //then
        Assert.assertEquals(expected, student1);
    }

    @Test
    public void testContains() {
        //when
        students.add(student);
        //then
        Assert.assertTrue(students.contains(student));
    }

    @Test
    public void testRemove() {
        //when
        students.add(student);
        students.remove(student);
        //then
        Assert.assertFalse(students.contains(student));
    }
}
