package GradingProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Class {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner reader = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter the name of the student: ");
        this.students.add(new Student(this.reader.nextLine()));
    }

    public String input() {
        return reader.nextLine().trim().toLowerCase();
    }

    public void printStudents() {
        try {
            for (Student student : this.students) {
                System.out.println(student);
            }
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }

    public void addGradeToStudent() {
        System.out.println("Enter name of the student: ");
        String name = this.input();
        for (Student student : this.students) {
            if (StringUtils.included(student.getName(), name)) {
                System.out.println("For which exam to you want to add the grade to " + student.getName() + "(Midterm, Final, Quiz 1, Quiz 2): ");
                try {
                    switch (this.reader.nextLine().trim().toLowerCase()) {
                        case "midterm" -> {
                            System.out.println("Enter the grade (max 100 pt): ");
                            student.gradeExam(1, reader.nextInt());
                        }
                        case "final" -> {
                            System.out.println("Enter the grade max 100 pt: ");
                            student.gradeExam(2, reader.nextInt());
                        }
                        case "quiz 1" -> {
                            System.out.println("Enter the grade max 10 pt: ");
                            student.gradeQuiz(1, reader.nextInt());
                        }
                        case "quiz 2" -> {
                            System.out.println("Enter the grade max 10 pt: ");
                            student.gradeQuiz(2, reader.nextInt());
                        }
                    }
                } catch (Error e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Student does not exist! ");
    }
}
