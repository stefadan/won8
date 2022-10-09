package acurs11enum;

import java.util.*;

public class DaySchedule {
    Map<DayOfWeek, List<String>> dailyActivity;

    public Map<DayOfWeek, List<String>> getDailyActivity() {
        return dailyActivity;
    }
    public DaySchedule(Map<DayOfWeek, List<String>> dailyActivity) {
        this.dailyActivity = dailyActivity;
    }

    public void reportActivity(){
        Set<Map.Entry<DayOfWeek, List<String>>> mapList = dailyActivity.entrySet();
        for (Map.Entry<DayOfWeek, List<String>> mp : mapList) {
            System.out.println("Day of week activities " + mp.getKey() + mp.getValue());
        }
    }

    public void addElement(DayOfWeek day, List<String> activieties){
        if (!dailyActivity.containsKey(day)) {
            dailyActivity.put(day, activieties);
        }
    }

    public void removeElement(DayOfWeek day){
        System.out.println("Cancel activities on "+day);
       if (dailyActivity.containsKey(day)) {
           dailyActivity.remove(day);
       }
    }

    public static void main(String[] args) {

        DaySchedule ds = new DaySchedule(
                new HashMap<DayOfWeek, List<String>>(){{
                    put(DayOfWeek.MONDAY, Arrays.asList("Strong Coffee","Job", "Movie"));
                    put(DayOfWeek.FRIDAY, Arrays.asList("Job", "Resting"));
                }}
        );

        ds.reportActivity();
        ds.addElement(DayOfWeek.SUNDAY, Arrays.asList("Housework", "Resting"));
        ds.reportActivity();
        ds.removeElement(DayOfWeek.SUNDAY);
        ds.reportActivity();
    }


}
