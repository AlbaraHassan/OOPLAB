package lab10.people;

public class Teacher extends Person {

    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public String toString(){
        return super.toString() + "\n\t" + "salary " + this.salary + " euros/month";
    }
}
