package tests;

import learnerlab.Learner;
import learnerlab.Person;
import learnerlab.Student;
import learnerlab.Students;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudent {

    private Student student;

    @Before
    public void setUp(){
        student = Students.getINSTANCE().findById(867530);
    }

    @Test
    public void testImplementation() {
        //then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        //then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        //given
        Student student = new Student("Phil", 1234567);
        //when
        student.learn(5.0);
        //then
        Assert.assertEquals(5.0 ,student.getTotalStudyTime(),0);

    }
}
