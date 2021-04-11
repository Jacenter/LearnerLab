package tests;

import learnerlab.Educator;
import learnerlab.Student;
import learnerlab.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testImplementation() {
        Assert.assertTrue(Educator.MIKAILA instanceof Teacher);
    }

    @Test
    public void testTeach() {
        Student student = new Student("Dawar",282976);
        Educator.MIKAILA.teach(student, 12);
        Assert.assertEquals(12, student.getTotalStudyTime(), .01);
        Assert.assertEquals(12, Educator.MIKAILA.getTimeWorked(), .01);
    }

    @Test
    public void testLecture() {
        Student student1 = new Student("Jared", 767219);
        Student student2 = new Student("Juliana", 292569);
        Educator.MIKAILA.lecture(new Student[]{student1,student2}, 12);
        Assert.assertEquals(6, student1.getTotalStudyTime(), .01);
        Assert.assertEquals(6, student2.getTotalStudyTime(), .01);
        Assert.assertEquals(12, Educator.MIKAILA.getTimeWorked(), .01);
    }
}
