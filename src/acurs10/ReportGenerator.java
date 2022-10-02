package acurs10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReportGenerator {
    public List<StudentGrade> getListaNoteStudenti() {
        return listaNoteStudenti;
    }

    List<StudentGrade> listaNoteStudenti;

    public ReportGenerator(List<StudentGrade> listaNoteStudenti) {
        this.listaNoteStudenti = listaNoteStudenti;
    }

    public List<Integer> getGrades() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < listaNoteStudenti.size(); i++) {
            //System.out.println("res "+studentGradeList.get(i).grade() + studentGradeList.get(i).name());
            result.add(listaNoteStudenti.get(i).grade());
        }
        return result;
    }

    public void generateReport() throws IOException {
        Integer sum = 0; Integer avg = 0;
        for (StudentGrade sg: listaNoteStudenti) {
            sum = sum + sg.grade();
        }
        avg = sum/listaNoteStudenti.size();
        Integer max = (Integer) Collections.max(getGrades());
        Integer min = (Integer) Collections.min(getGrades());
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/acurs10/file/grade-reports.out"));
        writer.write("Cea mai mare nota: "+ max); writer.newLine();
        writer.write("Nota medie: "+ avg); writer.newLine();
        writer.write("Cea mai mica nota: "+ min);
        writer.flush();
        writer.close();
    }

}
