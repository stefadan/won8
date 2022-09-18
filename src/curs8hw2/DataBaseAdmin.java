package curs8hw2;

import java.time.LocalDateTime;

public class DataBaseAdmin extends Emplyee {
    String dbTechnolgy;
    @Override
    public String getAddress() {
        return "dbAdmin" + address;
    }

    DataBaseAdmin(String firstName, String lastName, LocalDateTime birthDay, String address,
               LocalDateTime dateOfEmplyment, String position, String dbTechnolgy)
    {
        super(firstName, lastName, birthDay, address, dateOfEmplyment, position);
        this.dbTechnolgy=dbTechnolgy;
    }


}
