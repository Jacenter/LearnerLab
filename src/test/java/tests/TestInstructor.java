package tests;

import learnerlab.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {

    private Instructor instructor;
    private Student student;
    private Learner[] learners;

    @Before
    public void setUp() {
        instructor = Instructors.getInstanceOfInstructors().findById(125698);
        student = Students.getINSTANCE().findById(867530);
        learners = new Learner[]{Students.getINSTANCE().findById(867530), Students.getINSTANCE().findById(212567), Students.getINSTANCE().findById(193812)};
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testLearn() {
        //given
        //when
        instructor.teach(student, 4.0);
        //then
        Assert.assertEquals(4.0, student.getTotalStudyTime(), 0);
    }

    @Test
    public void testLecture() {
        //given
        //when
        instructor.lecture(learners, 9.0);
        double expectedTimePerStudent = 9.0/learners.length;
        //then
        Assert.assertEquals(3.0, expectedTimePerStudent,0);
    }
}
