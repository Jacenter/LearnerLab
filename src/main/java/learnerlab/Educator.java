package learnerlab;

public enum Educator implements Teacher{

    MIKAILA(125698, "Mikaila"), LEON(287626, "Leon");

    private long id;
    private String name;
    private double timeWorked;

    Educator(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        Instructors.getInstanceOfInstructors().findById(this.id).teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        Instructors.getInstanceOfInstructors().findById(this.id).lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;

    }
}
