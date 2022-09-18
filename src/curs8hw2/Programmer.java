package curs8hw2;

import java.time.LocalDateTime;

public class Programmer extends Emplyee{
    public String language;
    @Override
    public String getPosition() {
        return "programmer";
    }

    Programmer(String firstName, String lastName, LocalDateTime birthDay, String address,
               LocalDateTime dateOfEmplyment, String position, String language)
    {
        super(firstName, lastName, birthDay, address, dateOfEmplyment, position);
        this.language=language;
    }

    @Override
    public String getFullName()
    {
        return getFullName();
    }


}
