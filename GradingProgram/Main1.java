package GradingProgram;



public class Main1 {
    public static void main(String[] args) {
        Class cls = new Class();
        loop:
        while (true) {
            System.out.print("? ");
            String option = cls.input();
            switch (option) {
                case "add" -> cls.addStudent();
                case "grade" -> cls.addGradeToStudent();
                case "all" -> cls.printStudents();
                case "quit" -> {
                    break loop;
                }
            }

        }
    }
}
