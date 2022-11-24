package CounterType;

public class Test {
    public static void main(String[] args) {
        CounterType counter = new CounterType();
        counter.mutator(10);
        counter.printCount();
        counter.mutator(-11);
        counter.printCount();
        counter.incMutator();
        counter.incMutator();
        counter.incMutator();
        counter.printCount();
        counter.decMutator();
        counter.printCount();

    }
}
