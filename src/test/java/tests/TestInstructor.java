package tests;

import learnerlab.*;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor("Phil",12345);
        Assert.assertFalse(instructor instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor("Phil",12345);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testLearn() {
        //given
        Instructor instructor = new Instructor("Jim Jones", 12345);
        Student student = new Student("Killian", 12345);
        //when
        instructor.teach(student, 20.0);
        double expectedTimeLearned = 20.0;
        //then
        Assert.assertEquals(20.0, expectedTimeLearned, 0);
    }

    @Test
    public void testLecture() {
        //given
        Instructor instructor = new Instructor("Jim Jones", 12345);
        Learner[] learners = {new Student("Joe", 12345), new Student("Josh", 124345), new Student("Lisa", 12345)};
        //when
        instructor.lecture(learners, 60.0);
        double expectedTimePerStudent = 60.0/learners.length;
        //then
        Assert.assertEquals(20.0, expectedTimePerStudent,0);
    }
}
