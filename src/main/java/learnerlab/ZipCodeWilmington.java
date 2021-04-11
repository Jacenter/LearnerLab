package learnerlab;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {

    //declare a field of students that references the Students INSTANCE
    Students students = Students.getINSTANCE();
    //declare a field of Instructors that references the Instructors INSTANCE
    Instructors instructors = Instructors.getInstanceOfInstructors();

    //make this class a Singleton
    public static final ZipCodeWilmington ZIP_CODE_WILMINGTON_INSTANCE = new ZipCodeWilmington();

    //private constructor
    private ZipCodeWilmington() {
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        /* the personList inside the Students INSTANCE holds Person objects
        but we need to invoke the lecture method on each object in that personList
        lecture can only be invoked on an Array of Learners
        Student is a class that implements Learner which means every Student object is also a Learner
        so we will cast the Person objects in the personList to be treated as Student objects
        so we can invoke the lecture method on them.
        */
        Learner[] learners = Arrays.copyOf(students.toArray(), students.count(), Learner[].class);
        teacher.lecture(learners, numberOfHours);
        // use these parameters to host a lecture on the personList in the INSTANCE of Students
        }

    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = instructors.findById(id);
        hostLecture(teacher, numberOfHours);
        }

    public HashMap getStudyMap(){
        HashMap <Student, Double> studyMap = new HashMap<>();
        for (Person x : students.toArray()) {
            studyMap.put((Student) x,((Student) x).getTotalStudyTime());
        }
        return studyMap;
    }


    public static ZipCodeWilmington getZipCodeWilmingtonInstance() {
        return ZIP_CODE_WILMINGTON_INSTANCE;
    }
}

