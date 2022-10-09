package acurs11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {

    private List<Employee> employeeList;

    public EmployeeService(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    // 3.1 extract persons that have salaries more than a specified ammount
    List<String> getListSalary(Integer amount){
        List<String> result = new ArrayList<>();
        if (employeeList.size()==0||amount < 0){
            result = null;
        }
        for (Employee employee : employeeList) {
            if (employee.getSalary()>amount) {
                System.out.println(employee.getName());
                result.add(employee.getName());
            }
        }
        return result;
    }
    // 3.2 extract a Map that gathers all the persons for a company
    public Map<String, Integer> personAgeList(Company company){
        Map<String, Integer> result = new HashMap<>();
        if (employeeList.size()==0) {
            result = null;
        }
        for(Employee employee: employeeList){
            if (employee.getCompany().equals(company)) {
                result.put(employee.getName(), employee.getSalary());
            }
        }
        return result;
    }

    // 3.3 calculate the sum of all salaries for all employees
    Integer getSumSalaries(){
        Integer sum = 0;
        for(Employee employee: employeeList){
            sum+=employee.getSalary();
        }
        return sum;
    }

    //3.4 calculate which company gives the biggest salary
    Map<Company, Integer> getMaxSalary(){
        Integer maxSalary = 0;
        Map<Company, Integer> result = new HashMap<>();
        if (employeeList.size()==0) {
            result = null;
        }
        for(Employee employee: employeeList){
            if (maxSalary<employee.getSalary()){
                maxSalary = employee.getSalary();
                result.put(employee.getCompany(), employee.getSalary());
            }
        }
        return result;

    }

    public static void main(String[] args) {
        EmployeeService es = new EmployeeService(List.of());
        EmployeeService esList = new EmployeeService(List.of(
                        new Employee("Gina", 27,HairColor.RUBBISH, Company.DACIA, 5000),
                        new Employee("Robert", 35,HairColor.BROWN, Company.DACIA, 7000),
                        new Employee("Mirela", 43,HairColor.BLONDE, Company.RENAULT, 6000),
                        new Employee("Irina", 33,HairColor.RUBBISH, Company.MAZDA, 5800)

                )
        );
        System.out.println("Employee "+es.getListSalary(500) );
        System.out.println("Employee "+esList.getListSalary(500) );

        System.out.println("List of person from a company "+es.personAgeList(Company.DACIA) );
        System.out.println("List of person from a company "+esList.personAgeList(Company.DACIA) );

        System.out.println("Sum salaries "+es.getSumSalaries() );
        System.out.println("Sum salaries "+esList.getSumSalaries() );

        System.out.println("Company with max salary "+es.getMaxSalary() );
        System.out.println("Company with max salary "+esList.getMaxSalary() );


    }


}
