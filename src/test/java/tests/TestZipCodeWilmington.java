package tests;

import learnerlab.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        //tests for
        //when hostLecture
        //for each Student in the Students INSTANCE personList
        // check if their totalStudyTime instance variable is incremented by a specified numberOfHours when invoking hostLecture
        ZipCodeWilmington myCohort = ZipCodeWilmington.getZipCodeWilmingtonInstance();

        myCohort.hostLecture(125698, 70);
        HashMap<Student, Double> map = myCohort.getStudyMap();

        for (Student student : map.keySet()) {
            Assert.assertEquals(10, student.getTotalStudyTime(), .01);
        }

    }

        @Test
        public void testHostLectureEducator() {
        ZipCodeWilmington myCohort = ZipCodeWilmington.getZipCodeWilmingtonInstance();
            myCohort.hostLecture(Educator.MIKAILA, 70);

            HashMap<Student, Double> map = myCohort.getStudyMap();

            for (Student student : map.keySet()) {
                Assert.assertEquals(10, student.getTotalStudyTime(), .01);
            }
            Assert.assertEquals(70, Educator.MIKAILA.getTimeWorked(), .01);
        }
    }
