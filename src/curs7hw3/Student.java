package curs7hw3;

public class Student {
    private String name;
    private int grade;

    private static int sumOfGrade;
    private static int numberOfStudents;

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    Student(int grade){
        sumOfGrade+=grade;
        numberOfStudents++;
    }

    public static int avgerage(int sumOfGrade, int numberOfStudents){
        return sumOfGrade/numberOfStudents;
    }

    public static void main(String[] args) {
        Student student = new Student(8);
        Student student2 = new Student(9);
        Student student3 = new Student(10);

        System.out.println(String.format("Number of students %d", Student.numberOfStudents));
        System.out.println(String.format("Sum of grades %d", Student.sumOfGrade));
        System.out.println(String.format("Average all students %d",
                Student.avgerage(Student.sumOfGrade, Student.numberOfStudents)));

    }


}
