package 자동차만들기;

public class Goal {
    private int Goal;
    private int distance;

    public Goal(int goal, int distance) {
        Goal = goal;
        this.distance = distance;
    }

    public int getGoal() {
        return Goal;
    }

    public void setGoal(int goal) {
        Goal = goal;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
