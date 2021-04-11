package learnerlab;

import java.util.ArrayList;

public final class Students extends People<Student> {

    public static final Students INSTANCE = new Students();

    //private nullary constructor (a constructor that takes no parameters)
    private Students() {
        {
            Student student = new Student("Dawar", 867530);
            Student student1 = new Student("Juliana", 212567);
            Student student2 = new Student("Mike", 193812);

            eList.add(student);
            eList.add(student1);
            eList.add(student2);
        }
        }
        //this private nullary constructor prevents this class from being instantiated
        //the nullary constructor should POPULATE the INSTANCE field with Student representations of colleagues

    public static Students getINSTANCE() {
        return INSTANCE;
    }

    @Override
    Student[] toArray() {
        Student[] studentsArray = new Student[INSTANCE.count()];
        int y = 0;
        for (Student x : INSTANCE) {
            studentsArray[y++] = x;
        }
        return studentsArray;
    }
}
