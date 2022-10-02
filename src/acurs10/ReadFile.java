package acurs10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ReadFile {

    //public static void main(String[] args) throws IOException {
    //    String cale = "src/acurs10/file/grades.txt";
    //    List<StudentGrade> studentList = readStudent("src/acurs10/file/grades.txt");
    //}

    public static List<StudentGrade> readStudent(String cale) throws IOException {
        //System.out.println("cale "+cale);
        List<StudentGrade> result = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(cale));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println("line="+line);
            result.add(readRowStudent(line));
        }
        return result;
    }

    private static StudentGrade readRowStudent(String line) {
        //System.out.println("tokens="+line);
        String[] tokens = line.split(Pattern.quote("|"));
        return new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2].replaceAll("\\D", "")) );
    }

    private static String studentToLine(StudentGrade studentGrade) {
        return String.format("Student %s has grade %d to %s ",
                        studentGrade.name(),
                        studentGrade.grade(),
                        studentGrade.discipline()
                            );
    }



}

