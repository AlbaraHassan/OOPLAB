package GradingProgram;

import java.util.HashMap;

public class Student {
    private String name;
    private HashMap<String, Integer> grades = new HashMap<>();
    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void gradeQuiz(int quizNumber, int grade){
        if(grade <= 10) this.grades.put("Quiz "+quizNumber, grade);
        else throw new Error("Grade should not more than 10 pt");
    }

    public void gradeExam(int examNumber, int grade){
        if(grade <= 100) this.grades.put(examNumber == 1? "Midterm": "Final", examNumber == 1? grade * 25 / 100 : grade * 50/100);//points*pre/totalper
        else throw new Error("Grade should not more than 100 pt");

    }

    private double calculateTotalQuiz(){
        double quizTotal = 0;
        for(String key : this.grades.keySet()){
            if(key.contains("Quiz")) quizTotal += this.grades.get(key);
        }
        quizTotal = quizTotal * 25 / 20;
        return quizTotal;
    }

    private double calculateTotalExams(){
        double examsTotal = 0;
        for(String key : this.grades.keySet()){
            if(key.equals("Midterm") || key.equals("Final")) examsTotal += this.grades.get(key);
        }
        return examsTotal;
    }

    private boolean isGraded(){
        return this.grades.keySet().toArray().length == 4;
    }

    public String finalGrade(){
        if(!this.isGraded()) throw new Error("Student " + this.name + " is not graded");
        double total = this.calculateTotalQuiz() + this.calculateTotalExams();
        return "Name: " + this.name + " Grade: " + (total >= 90? "A":(total >= 80? "B": (total >= 70? "C": (total >= 60? "D": "F")))) + " Percentage: " + total + "%" + " Average: " + total/10;
    }

    public String toString(){
        return this.finalGrade();
    }

}
