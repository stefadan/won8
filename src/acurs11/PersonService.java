package acurs11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {
    private List<Person> personList;

    public PersonService(List<Person> person) {
        this.personList = person;
    }

    List<String> getPersonNameList() {
        List<String> result = new ArrayList<>();
        if (personList.size()==0){
            result = null;
        }
        for (Person person : personList) {
            //System.out.println(person.name());
            result.add(person.getName());
        }
        return result;
    }

    //2.2 create a map from person's name to their age
    public Map<String, Integer> personAgeList(){
        Map<String, Integer> result = new HashMap<>();
        if (personList.size()==0) {
            result = null;
        }
        for(Person person: personList){
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    //2.3 extract the persons that are older than a given age
    public Map<String, Integer> personGivenAgeList(Integer age){
        Map<String, Integer> result = new HashMap<>();
        if (personList.size()==0) {
            result = null;
        }
        for(Person person: personList){
            if (person.getAge()>age) {
                result.put(person.getName(), person.getAge());
            }
        }
        return result;
    }

    //2.4 extract a map from person's hair colour to their name (String->List<String>)
    Map<String, List<String>> hairToName() {
        Map<String, List<String>> result = new HashMap<>();
        for (Person pers : personList) {
            HairColor hairColor = pers.getHairColour();
            if (!result.containsKey(hairColor)) {
                result.put(hairColor.toString(), new ArrayList<>());
            }
            result.get(hairColor.toString()).add(pers.getName());
        }
        return result;
    }

    // 2.5 create a map from age to list of persons
    Map<Integer, List<String>> ageToListPerson() {
        Map<Integer, List<String>> result = new HashMap<>();
        for (Person pers : personList) {
            Integer age = pers.getAge();
            if (!result.containsKey(age)) {
                result.put(pers.getAge(), new ArrayList<>());
            }
                result.get(pers.getAge()).add(pers.getName());
        }
        return result;
    }

    public static void main(String[] args) {
        PersonService ps = new PersonService(List.of());
        PersonService psa = new PersonService(List.of(
                new Person("Andrea", 20, HairColor.BLONDE),
                new Person("Ina", 30, HairColor.BROWN),
                new Person("Isa", 33, HairColor.RUBBISH),
                new Person("Ion", 34, HairColor.BLONDE)

        ));
        System.out.println("List name " + ps.getPersonNameList());
        System.out.println("List name " + psa.getPersonNameList());

        System.out.println("List age " + ps.personAgeList());
        System.out.println("List age " + psa.personAgeList());

        System.out.println("Older than 25 " + ps.personGivenAgeList(25));
        System.out.println("Older than 25 " + psa.personGivenAgeList(25));

        System.out.println("hair to name "+ps.hairToName());
        System.out.println("hair to name "+psa.hairToName());

        System.out.println("hair to name "+ps.ageToListPerson());
        System.out.println("hair to name "+psa.ageToListPerson());




    }

}
