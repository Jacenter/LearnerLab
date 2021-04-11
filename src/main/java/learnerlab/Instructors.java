package learnerlab;

import java.util.Iterator;

public final class Instructors extends People<Instructor> {

    public static final Instructors INSTANCE_OF_INSTRUCTORS = new Instructors();

    //private nullary constructor
    private Instructors() {

        Instructor instructor = new Instructor("Mikaila", 125698);
        Instructor instructor1 = new Instructor("Leon", 287626);

        eList.add(instructor);
        eList.add(instructor1);
    }

    public static Instructors getInstanceOfInstructors() {
        return INSTANCE_OF_INSTRUCTORS;
    }

    @Override
    Instructor[] toArray() {
        Instructor[] instructorsArray = new Instructor[INSTANCE_OF_INSTRUCTORS.count()];
        int y = 0;
        for (Instructor x : INSTANCE_OF_INSTRUCTORS) {
            instructorsArray[y++] = x;
        }
        return instructorsArray;
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }
}
