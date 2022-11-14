package lab5;

public class Ex1Player {
    private String name;
    private int goals;


    public Ex1Player(String name) {
        this(name, 0);
    }
    public Ex1Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return this.goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public String toString() {
        return "Name: " + this.getName() + ", Goals: " + this.getGoals();
    }
}
