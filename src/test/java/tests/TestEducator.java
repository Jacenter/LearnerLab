package tests;

import learnerlab.Educator;
import learnerlab.Student;
import learnerlab.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEducator {

    private Student student1;
    private Student student2;
    private Student[] students;
    private Educator educator1;
    private Educator educator2;

    @Before
    public void setUp() {
        student1 = new Student("Jared", 169832);
        student2 = new Student("Dawar", 898726);
        students = new Student[]{student1,student2};
        educator1 = Educator.MIKAILA;
        educator2 = Educator.LEON;
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(educator1 instanceof Teacher);
        Assert.assertTrue(educator2 instanceof Teacher);
    }

    @Test
    public void testTeach() {
        educator1.teach(student1, 12);
        Assert.assertEquals(12, student1.getTotalStudyTime(), 0);
        Assert.assertEquals(12, educator1.getTimeWorked(), 0);
    }

    @Test
    public void testLecture() {
        educator2.lecture(students, 12);
        Assert.assertEquals(6, students[0].getTotalStudyTime(), 0);
        Assert.assertEquals(6, students[1].getTotalStudyTime(), 0);
        Assert.assertEquals(12, educator2.getTimeWorked(), 0);
    }
}
