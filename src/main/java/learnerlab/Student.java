package learnerlab;

public class Student extends Person implements Learner {
    private double totalStudyTime; //totalStudyTime instance variable


    public Student(String name, long id) {
        super(name, id);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;

    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
