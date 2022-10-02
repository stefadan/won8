package acurs10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Classroom {

    List<StudentGrade> studentGradeList;

    public Classroom(List<StudentGrade> studentGradeList) {
        this.studentGradeList = studentGradeList;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < studentGradeList.size(); i++) {
            if (studentGradeList.get(i).discipline().equals(discipline)) {
                result.add(studentGradeList.get(i).grade());
            }
        }
        return result;
    }

    public List<Integer> getGradesForStudent(String student) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < studentGradeList.size(); i++) {
            if (studentGradeList.get(i).name().equals(student)) {
                //System.out.println("res "+studentGradeList.get(i).grade() + studentGradeList.get(i).name());
                result.add(studentGradeList.get(i).grade());
            }
        }
        return result;
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade sg = null;
        int max = 0;
        for (int i = 0; i < studentGradeList.size(); i++) {
            if (studentGradeList.get(i).discipline().equals(discipline)) {
                if (studentGradeList.get(i).grade() > max) {
                    max = studentGradeList.get(i).grade();
                    sg = studentGradeList.get(i);
                }
            }
        }
        return sg;
    }

    private StudentGrade getMaxGrade() {
        StudentGrade sg = null;
        int max = studentGradeList.get(0).grade();
        for (int i = 0; i < studentGradeList.size(); i++) {
            if (studentGradeList.get(i).grade() > max) {
                max = studentGradeList.get(i).grade();
                sg = studentGradeList.get(i);
            }
        }
        return sg;
    }

    private Integer getAverageGrade(String discipline) {
        Integer sum = 0; Integer num = 0;
        for (int i = 0; i < studentGradeList.size(); i++) {
            if (studentGradeList.get(i).discipline().equals(discipline)) {
                sum = sum + studentGradeList.get(i).grade();
                num++;
            }
        }
        return sum / num;
    }

    private StudentGrade getWorstGrade(String discipline) {
        StudentGrade sg = null;
        int min = studentGradeList.get(0).grade();
        for (int i = 0; i < studentGradeList.size(); i++) {
            if (studentGradeList.get(i).discipline().equals(discipline)) {
                if (studentGradeList.get(i).grade() < min) {
                    min = studentGradeList.get(i).grade();
                    sg = studentGradeList.get(i);
                }
            }
        }
        return sg;
    }


    public static void main(String[] args) throws IOException {
        String discipline = "Mathematics";
        String studentName = "Amilia Hilaria";
        String cale = "src/acurs10/file/grades.txt";

        ReadFile rf = new ReadFile();
        List<StudentGrade> studentList = rf.readStudent("src/acurs10/file/grades.txt");
        Classroom cla = new Classroom(studentList);

        System.out.println(String.format("Notele pentru disciplina %s :  (%s)",
                                    discipline,
                                    cla.getGradesForDiscipline(discipline)));
        System.out.println(String.format("Notele pentru studentul %s : (%s)",
                                    studentName,
                                    cla.getGradesForStudent(studentName)));
        StudentGrade sg = cla.getMaxGrade(discipline);
        System.out.println(String.format("Nota maxima la disciplina %s este %d student %s",
                                    discipline, sg.grade(), sg.name()));

        StudentGrade sga = cla.getMaxGrade();
        System.out.println(String.format("Nota maxima %d student %s",
                                    sga.grade(),
                                    sga.name()));
        Integer avg = cla.getAverageGrade(discipline);
        System.out.println(String.format("Media aritmetica la disciplina %s este %d",
                                    discipline,
                                    avg));
        StudentGrade sgw = cla.getWorstGrade(discipline);
        System.out.println(String.format("Nota minima la disciplina %s %d student %s",
                discipline,
                sgw.grade(),
                sgw.name()));

        ReportGenerator rg = new ReportGenerator(studentList);
        rg.generateReport();
    }

}
