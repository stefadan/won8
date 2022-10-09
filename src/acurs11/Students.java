package acurs11;

import java.util.*;

public class Students {
    //Find the student with the highest grade
    public static void main(String[] args) {

    Map<String, Integer> student = new HashMap<String, Integer>();

    student.put("Andrei Vasile", 9);
    student.put("Mario Marin", 8);
    student.put("Andreea Ion", 10);
    student.put("Mariana Popa", 9);

        for (Map.Entry<String, Integer> i : student.entrySet()) {
            System.out.println(String.format("%s is graded %d ", i.getKey(), i.getValue()));
        }

        int maxValue = Collections.max(student.values());

        List<String> maxValueKeys = new ArrayList<>();
        for (Map.Entry<String, Integer> p : student.entrySet()) {
            if (p.getValue() == maxValue) {
                maxValueKeys.add(p.getKey());
            }
        }

        System.out.println(String.format("Max grade for student: %s grade %d", maxValueKeys, maxValue));




    }

    }
