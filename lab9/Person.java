package lab9;

public class Person {
    public Person(String name, int age){
        if(name == null || name.length() == 0 || name.length() > 40 || !(age < 120 && age > 0) ){
            throw new IllegalArgumentException("The arguments are wrong");
        }
    }
}
