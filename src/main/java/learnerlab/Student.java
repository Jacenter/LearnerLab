package learnerlab;

public class Student extends Person implements Learner {
    private double totalStudyTime; //totalStudyTime instance variable


    public Student(String name, long id) {
        super(name, id);
    }

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime = totalStudyTime + numberOfHours;

    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
