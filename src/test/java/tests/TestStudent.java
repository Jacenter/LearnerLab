package tests;

import learnerlab.Learner;
import learnerlab.Person;
import learnerlab.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        //given
        Student student = new Student("Mike", 1234567);
        //then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        //given
        Student student = new Student("John",1234567);
        //then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        //given
        Student student = new Student("Phil", 1234567);
        //when
        student.learn(20.0);
        double expectedLearnedTime = student.getTotalStudyTime();
        //then
        Assert.assertEquals(20.0 ,expectedLearnedTime,0);

    }
}
