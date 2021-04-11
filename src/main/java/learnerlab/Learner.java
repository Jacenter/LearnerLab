package learnerlab;

public interface Learner {

    void learn (double numberOfHours) throws NullPointerException;

    Double getTotalStudyTime();
}
