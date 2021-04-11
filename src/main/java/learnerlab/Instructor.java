package learnerlab;

public class Instructor extends Person implements Teacher{
    public Instructor(String name, long id) {
        super(name, id);

    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double hoursPerLearner = numberOfHours/ learners.length;
        for (Learner each : Students.getINSTANCE()) {
            each.learn(hoursPerLearner);
        }
    }
}
