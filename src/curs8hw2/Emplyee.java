package curs8hw2;

import java.time.LocalDateTime;

public class Emplyee implements Person{
    public String firstName;
    public String lastName;
    public LocalDateTime birthDay;
    public String address;
    public LocalDateTime dateOfEmplyment;
    public String position;

    public LocalDateTime getDateOfEmplyment() {
        return dateOfEmplyment;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDateTime getBirthDay() {
        return birthDay;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public Emplyee(String firstName, String lastName, LocalDateTime birthDay, String address, LocalDateTime dateOfEmplyment, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
        this.dateOfEmplyment = dateOfEmplyment;
        this.position = position;
    }

    public String getFullName()
    {
        return getLastName()+" "+getFirstName();
    }
}
