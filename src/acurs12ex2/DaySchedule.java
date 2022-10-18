package acurs12ex2;

import java.util.List;

public class DaySchedule {
    DayOfWeek dow;
    List <String> listActvity;


    public DayOfWeek getDow() {
        return dow;
    }

    public List<String> getActivity() {
        return listActvity;
    }

    public DaySchedule(DayOfWeek dow, List<String> listActvity) {
        this.dow = dow;
        this.listActvity = listActvity;
    }

    @Override
    public String toString() {
        return this.dow + " + " + this.listActvity;

    }


}
