package curs8hw2;

import java.time.LocalDateTime;
import java.time.Period;

public class Info {
    //LocalDateTime birthDate = LocalDateTime.of(1984, 12, 16, 0, 0, 0);
    LocalDateTime birthDate = LocalDateTime.of(1984, 2, 29, 0, 0, 0);
    LocalDateTime dateOfEmployment = LocalDateTime.of(2022, 1, 10, 0, 0, 0);
    LocalDateTime currentTime = LocalDateTime.now();

    Person person = new Programmer(
            "Popa", "Andrei", birthDate,
            "Bucharest", dateOfEmployment, "senior", "Java"
    );

    public String fullName() {
        return person.getLastName() + " " + person.getFirstName();
    }

    public int getAge() {
        //System.out.println(currentTime);
        int diff = Period.between(birthDate.toLocalDate(), currentTime.toLocalDate()).getYears();
        return diff;
    }

}
