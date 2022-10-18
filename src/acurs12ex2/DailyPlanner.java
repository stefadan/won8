package acurs12ex2;

import java.util.*;

public class DailyPlanner {
    List<DaySchedule> dailyPlanner;
    DaySchedule daySchedule;

    public DaySchedule getDaySchedule() {
        return daySchedule;
    }

    public DailyPlanner(List<DaySchedule> dailyPlanner) {
        this.dailyPlanner = dailyPlanner;
    }

    public List<DaySchedule> getDailyPlanner() {
        return dailyPlanner;
    }

    public void addActivity(DayOfWeek day, String activity) throws NoActivityException {
        List<String> listaActivitati = Arrays.asList(activity);
        if (activity == null) {
            throw new NoActivityException("Activity not specified");
        }
        dailyPlanner.add(new DaySchedule(day, listaActivitati));
    }

    public void removeActivity(DayOfWeek day, String activity) throws RuntimeException {
        if (activity == null) {
            throw new RuntimeException("Error on removing activity/day " + activity + "/" + day.toString());//NoActivityException("Activity not specified");
        }
        for (int i = 0; i < dailyPlanner.size(); i++) {
            List<String> listaActivitati = Arrays.asList(activity);
            System.out.println("A " + dailyPlanner.get(i).getDow() + " B " + day);
            System.out.println("Lista " + listaActivitati);
            System.out.println();
            if (dailyPlanner.get(i).getDow() == day) {
                if (dailyPlanner.get(i).getActivity().equals(listaActivitati)) {
                    dailyPlanner.remove(new DaySchedule(day, listaActivitati));
                    System.out.println("Removed");
                } else {
                    throw new RuntimeException("Could not remove - activity not found " + activity);
                }
            }
        }
    }
    public List<String> getActivities(DayOfWeek day) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < dailyPlanner.size(); i++) {
            if (dailyPlanner.get(i).getDow().equals(day)) {
                for (int j = 0; j < dailyPlanner.get(i).getActivity().size(); j++) {
                    result.add(i, dailyPlanner.get(i).getActivity().toString());
                    System.out.println("dp="+dailyPlanner.get(i).getActivity().toString());
                }
            }
        }
        return result;
    }

    public Map<DayOfWeek, List<String>> endPlanning() throws NoActivitiesForDayException {
    Map<DayOfWeek, List<String>> result = new HashMap<>();
    if (dailyPlanner.size() == 0) {
        throw new NoActivitiesForDayException("No activity in schedule");
    }
        for (DayOfWeek day : DayOfWeek.values()) {
            for (int i = 0; i < dailyPlanner.size(); i++) {
            if (dailyPlanner.get(i).getDow() == day) {
                result.putIfAbsent(day, Arrays.asList(dailyPlanner.get(i).getActivity().toString()));
            } else {
                throw new NoActivitiesForDayException("No activities for day "+day.toString());
            }
        }
    }
    return result;
    }

    @Override
    public String toString() {
        return this.dailyPlanner + " + " + this.daySchedule;

    }


    public static void main(String[] args) {
        DaySchedule ds = new DaySchedule(DayOfWeek.MONDAY, Arrays.asList("New Monday Activity"));
        DailyPlanner dp = new DailyPlanner(new ArrayList<>());

        try {
            //dp.addActivity(DayOfWeek.MONDAY, null);
            dp.addActivity(DayOfWeek.MONDAY, "Another Monday Activity");
            dp.addActivity(DayOfWeek.MONDAY, "Another One Monday Activity");
            dp.addActivity(DayOfWeek.FRIDAY, "Friday Activity");
            dp.addActivity(DayOfWeek.FRIDAY, "Another Friday Activity");
            dp.addActivity(DayOfWeek.SUNDAY, "ActivityToRemove");

            System.out.println(dp.getDailyPlanner().toString());
        } catch (NoActivityException e) {
            System.out.println("Error on adding activity: " + e.getMessage());
        }
        finally{
            System.out.println("Finally...");
        }

        List<String> listaActiv = dp.getActivities(DayOfWeek.MONDAY);

        Map<DayOfWeek, List<String>> result;
        try {
            result = dp.endPlanning();
        } catch (NoActivitiesForDayException e) {
            System.out.println("Error on daily activity"+e.getMessage());
        }
        System.out.println(dp.getDailyPlanner().toString());

        dp.removeActivity(DayOfWeek.SUNDAY, "ActivityToRemove");

        }
}